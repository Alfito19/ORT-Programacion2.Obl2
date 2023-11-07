package dominio;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

import java.awt.Label;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.*;

public class Sistema implements Serializable {
    private ArrayList<Entrevista> listaEntrevistas;
    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<String> listaCedulas;
    private ArrayList<Habilidad> listaHabilidades;
    private ArrayList<Puesto> listaPuestos;
    private PropertyChangeSupport manejador;

    public Sistema(){
        manejador = new PropertyChangeSupport(this);
        listaEntrevistas = new ArrayList<>();
        listaPostulantes = new ArrayList<>();
        listaEvaluadores = new ArrayList<>();
        listaHabilidades = new ArrayList<>();
        listaCedulas = new ArrayList<>();
        listaPuestos= new ArrayList<>();
    }
    
    //devuelve true si la tematica no existe y la pudo agregar correctamente
    public boolean agregarTematica(String unNombre,String unaDescripcion){
        Habilidad t = new Habilidad(unNombre,unaDescripcion);
        boolean vuelta = this.tematicaUnica(unNombre);
        ArrayList<Habilidad> anterior = this.getListaTematicas();
        if(vuelta){
            this.listaHabilidades.add(t);
            manejador.firePropertyChange("listaHabilidades",anterior,this.listaHabilidades);
        }
        return vuelta;
        
    }
    
    public boolean tematicaUnica(String unNombre){
        boolean cond = true;
        for(Habilidad h : this.listaHabilidades){
            if (h.getNombre().equalsIgnoreCase(unNombre)){
                cond = false;
            }
        }
        return cond;
    }

    //verifica que la cedula de la persona a ingresar sea unica
    public boolean cedulaUnica(String unaCedula){
        boolean cond = true;
        for (String c : listaCedulas){
            if (c.equalsIgnoreCase(unaCedula)){
                cond = false;
            }
        }
        return cond;
    }
    
    //retorna false si no pudo agregar al postulante
    public boolean altaPostulante(String unNombre,String unaCedula,String unaDireccion,String unTel,String unMail,String link,String unFormato,ArrayList<Habilidad> habs){
        boolean vuelta = this.cedulaUnica(unaCedula);
        //antes de agregar verifica que sea el unico con esa cedula
        if (vuelta){
            Postulante p = new Postulante(unNombre, unaCedula, unaDireccion, unTel, unMail, link, unFormato, habs);
            this.listaPostulantes.add(p);
            this.listaCedulas.add(unaCedula);
        }
        return vuelta;
    }
    
    public void agregarPostulante(Postulante p){
        this.listaPostulantes.add(p);
        this.listaCedulas.add(p.getCedula());
    }
    
    public void eliminarPostulante(Postulante unP){
        this.eliminarEntrevistas(unP);
        this.listaPostulantes.remove(unP);
    }
    
    //devuelve false si no lo puede agregar, y viceversa
    public boolean agregarEvaluador(String unNombre,String unaCedula,String unaDireccion,long unIngreso){
        boolean vuelta = this.cedulaUnica(unaCedula);
        if (vuelta){
            Evaluador e = new Evaluador(unNombre, unaCedula, unaDireccion, unIngreso);
            this.listaEvaluadores.add(e);
            this.listaCedulas.add(unaCedula);
        }
        return vuelta;
    }

    public int indicePostulante(String cedula){
        int indice = 0;
        for(int i = 0; i<this.listaPostulantes.size();i++){
            if (this.listaPostulantes.get(i).getCedula().equalsIgnoreCase(cedula)){
                indice = i;
            }
        }
        return indice;
    }
    
    //devuelve el objeto postulante pasandole la cedula
    public Postulante getPostulante(String cedula){
        return this.listaPostulantes.get(this.indicePostulante(cedula));
    }

    public void agregarEntrevista(Evaluador unEval,Postulante unPos,int aScore,String unComentario){
        Entrevista e = new Entrevista(unEval,unPos,aScore,unComentario);
        this.listaEntrevistas.add(e);
        int indice = this.indicePostulante(unPos.getCedula());
        this.listaPostulantes.get(indice).agregarPuntaje(aScore);
    }
    
    //elimina entrevista cuando se elimina postulante
    public void eliminarEntrevistas(Postulante elPostulante){
        for (Entrevista e : this.listaEntrevistas){
            if (e.getEntrevistado().equals(elPostulante)){
                this.listaEntrevistas.remove(e);
            }
        }
    }
    
    //retorna false si ya existe un puesto con ese nombre
    public boolean agregarPuesto(String aName, String tipo, ArrayList<Habilidad> temas){
        boolean vuelta = this.puestoUnico(aName);
        if(vuelta){
            Puesto nuevoPuesto = new Puesto(aName, tipo, temas);
            this.listaPuestos.add(nuevoPuesto);
        }
        return vuelta;
    }

    public boolean puestoUnico(String nombrePuesto){
        boolean cond = true;
        for(Puesto p : this.listaPuestos){
            if (p.getNombre().equalsIgnoreCase(nombrePuesto)){
                cond = false;
            }
        }
        return cond;
    }

    //falta ordenar lista en orden decreciente por puntaje de entrevistas
    public ArrayList<Postulante> consultaPuesto(Puesto unP,int nivel){
        ArrayList<Postulante> aptos = new ArrayList<>();
        for (Postulante post : this.listaPostulantes){
            if(this.cumpleCondiciones(post,unP,nivel)){
                aptos.add(post);
            }
        }
        //ordena la lista en orden descendente de puntaje de entrevistas
        if(aptos.isEmpty()){
            Comparator<Postulante> descendingComparator = (obj1, obj2) -> {
                return obj1.compara(obj2);
            };
            Collections.sort(aptos, descendingComparator);
        }
        return aptos;
    }
    
    //verifica que el postulante cumpla con todos los requisitos de todas las habilidades
    public boolean cumpleCondiciones(Postulante p, Puesto unPuesto, int nivel){
        boolean cond = true;
        for (Habilidad h : unPuesto.getTemasRequeridos()){
            for (Habilidad hPostulante : p.getHabilidades()){
                if (hPostulante.getNombre().equalsIgnoreCase(h.getNombre()) && !(hPostulante.getNivel()>=nivel)){
                    cond = false;
                }
            }
        }
        return cond;
    }

    //si la lista es vacia significa que el postulante no fue entrevistado
    //este metodo se usa en Historia Postulante
    public ArrayList<Entrevista> entrevistasPostulante(Postulante p){
        ArrayList<Entrevista> vuelta = new ArrayList<>();
        for (Entrevista e : this.listaEntrevistas){
            if (e.getEntrevistado().getCedula().equalsIgnoreCase(p.getCedula())){
                vuelta.add(e);
            }
        }
        return vuelta;
    }
    
    //metodo que retorna entrevistas con palabra determinada
    public ArrayList<Entrevista> entrevistasPal(ArrayList<Entrevista> entrevistasPost, String pal){
        ArrayList<Entrevista> vuelta = new ArrayList<>();
        for(Entrevista e : entrevistasPost){
            if(e.getComentario().toLowerCase().contains(pal.toLowerCase())){
                vuelta.add(e);
            }
        }
        return vuelta;
    }

    //devuelve lo siguiente:
        //Cantidad de postulantes que tiene un nivel mayor a 5 en esta temática.
        //Cantidad de puestos que buscan que requieran conocimiento en esta temática.
    public String consultaTematicaPostulantes(Habilidad unaTematica){
        String vuelta="";
        int cantPostulantes=0;
        for (Postulante p : this.listaPostulantes){
            for(Habilidad hP : p.getHabilidades()){
                if(hP.getNombre().equalsIgnoreCase(unaTematica.getNombre()) && (hP.getNivel()>5)){
                    cantPostulantes++;
                }
            }
        }
        vuelta = "Hay " + cantPostulantes + " postulantes que tienen un nivel mayor a 5 en " + unaTematica.getNombre() + "\n";
        return vuelta;
    }
    
    public String consultaTematicaPuestos(Habilidad unaTematica){
        String vuelta="";
        int cantPuestos=0;
        for (Puesto puesto : this.listaPuestos){
            for(Habilidad hPuesto : puesto.getTemasRequeridos()){
                if (hPuesto.getNombre().equalsIgnoreCase(unaTematica.getNombre())){
                    cantPuestos++;
                }
            }
        }
        vuelta+= "Hay " + cantPuestos + " puestos que requieren conocimiento en " + unaTematica.getNombre();
        return vuelta;
    }
    
    public ArrayList<Evaluador> getListaEvaluadores(){
        ArrayList<Evaluador> vuelta = new ArrayList<>();
        for (Evaluador e : this.listaEvaluadores){
            vuelta.add(e);
        }
        return vuelta;
    }
    
    public ArrayList<Entrevista> getListaEntrevistas(){
        ArrayList<Entrevista> vuelta = new ArrayList<>();
        for (Entrevista e : this.listaEntrevistas){
            vuelta.add(e);
        }
        return vuelta;
    }
    
    public ArrayList<Postulante> getListaPostulantes(){
        ArrayList<Postulante> vuelta = new ArrayList<>();
        for (Postulante p : this.listaPostulantes){
            vuelta.add(p);
        }
        return vuelta;
    }
    
    public ArrayList<Habilidad> getListaTematicas(){
        ArrayList<Habilidad> vuelta = new ArrayList<>();
        for(Habilidad h : this.listaHabilidades){
            vuelta.add(h);
        }
        return vuelta;
    }
    
    public ArrayList<Puesto> getListaPuestos(){
        ArrayList<Puesto> vuelta = new ArrayList<>();
        for(Puesto p : this.listaPuestos){
            vuelta.add(p);
        }
        return vuelta;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener){
        manejador.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener){
        manejador.removePropertyChangeListener(listener);
    }
}
