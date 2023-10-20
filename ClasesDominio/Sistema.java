package ClasesDominio;

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
        //antes de agregar veridica que sea el unico con esa cedula
        if (vuelta){
            Postulante p = new Postulante(unNombre, unaCedula, unaDireccion, unTel, unMail, link, unFormato, habs);
            this.agregarPostulante(p);
        }
        return vuelta;
    }
    public void agregarPostulante(Postulante unP){
        this.listaPostulantes.add(unP);
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
        }
        return vuelta;
    }

    public void agregarEntrevista(Evaluador unEval,Postulante unPos,int aScore,String unComentario){
        Entrevista e = new Entrevista(unEval,unPos,aScore,unComentario);
        this.listaEntrevistas.add(e);
    }

}
