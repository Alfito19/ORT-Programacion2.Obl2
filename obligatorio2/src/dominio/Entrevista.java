package dominio;

//Joaquin Hernandez (257620)

import java.io.Serializable;

//Alfonso Saizar (305968)

public class Entrevista implements Serializable {
    private Evaluador evaluador;
    private Postulante entrevistado;
    private int puntaje;
    private String comentario;
    private int numeroEntrevista;
    private static int identificador = 0;

    public Entrevista(Evaluador unEval,Postulante unPost,int unPuntaje,String unCom){
        this.evaluador = unEval;
        this.entrevistado = unPost;
        this.puntaje = unPuntaje;
        this.comentario = unCom;
//        setIdentificador();
        this.numeroEntrevista = setIdentificador();
    }

//    public static void setIdentificador(){
//        identificador++;
//    }
    
    public static int setIdentificador(){
        return ++identificador;
    }

    public Postulante getEntrevistado(){
        return this.entrevistado;
    }
    
    public String getEvaluador(){
        return this.evaluador.toString();
    }
    
    public int getPuntaje(){
        return this.puntaje;
    }
    
    public int getIdentificador(){
        return this.numeroEntrevista;
    }
    
    public String getComentario(){
        return this.comentario;
    }
}
