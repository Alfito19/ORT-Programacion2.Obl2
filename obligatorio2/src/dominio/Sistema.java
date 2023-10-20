package dominio;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

import java.util.*;

public class Sistema {
    private ArrayList<Entrevista> listaEntrevistas;
    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Long> listaCedulas;
    private ArrayList<Habilidad> listaHabilidades;
    private ArrayList<Puesto> listaPuestos;

    public Sistema(){
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
        boolean vuelta = !this.listaHabilidades.contains(t);
        if(vuelta){
            this.listaHabilidades.add(t);
        }
        return vuelta;
    }

    //verifica que la cedula de la persona a ingresar sea unica
    public boolean cedulaUnica(long unaCedula){
        boolean cond = true;
        for (Long c : listaCedulas){
            if (c == unaCedula){
                cond = false;
            }
        }
        return cond;
    }
    //retorna false si no pudo agregar al postulante
    public boolean altaPostulante(String unNombre,long unaCedula,String unaDireccion,String unTel,String unMail,String link,String unFormato,ArrayList<Habilidad> habs){
        boolean vuelta = this.cedulaUnica(unaCedula);
        //antes de agregar verifica que sea el unico con esa cedula
        if (vuelta){
            Postulante p = new Postulante(unNombre, unaCedula, unaDireccion, unTel, unMail, link, unFormato, habs);
            this.listaPostulantes.add(p);
            this.listaCedulas.add(unaCedula);
        }
        return vuelta;
    }

    public void eliminarPostulante(Postulante unP){
        this.listaPostulantes.remove(unP);
    }
    //devuelve false si no lo puede agregar, y viceversa
    public boolean agregarEvaluador(String unNombre,long unaCedula,String unaDireccion,long unIngreso){
        boolean vuelta = this.cedulaUnica(unaCedula);
        if (vuelta){
            Evaluador e = new Evaluador(unNombre, unaCedula, unaDireccion, unIngreso);
            this.listaEvaluadores.add(e);
            this.listaCedulas.add(unaCedula);
        }
        return vuelta;
    }

    public int indicePostulante(Postulante unP){
        int indice = 0;
        for(int i = 0; i<this.listaPostulantes.size();i++){
            if (this.listaPostulantes.get(i).getCedula() == unP.getCedula()){
                indice = i;
            }
        }
        return indice;
    }

    public void agregarEntrevista(Evaluador unEval,Postulante unPos,int aScore,String unComentario){
        Entrevista e = new Entrevista(unEval,unPos,aScore,unComentario);
        this.listaEntrevistas.add(e);
        int indice = this.indicePostulante(unPos);
        this.listaPostulantes.get(indice).agregarPuntaje(aScore);
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
}
