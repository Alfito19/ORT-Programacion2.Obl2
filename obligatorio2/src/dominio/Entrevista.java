package dominio;
import java.io.Serializable;

//Joaquin Hernandez (257620)
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
        this.numeroEntrevista = setIdentificador();
    }
    
    public static int setIdentificador(){
        return ++identificador;
    }
    //se llama cada vez que se serializa sistema
    public static void setIdentificador(int ident){
        identificador = ident;
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
    
    public static int identFinal(){
        return identificador;
    }
}
