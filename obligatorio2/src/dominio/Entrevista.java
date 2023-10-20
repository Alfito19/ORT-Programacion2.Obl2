package dominio;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class Entrevista {
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
        this.numeroEntrevista = getIdentificador();
    }

//    public static void setIdentificador(){
//        identificador++;
//    }
    
    public static int getIdentificador(){
        return identificador++;
    }
}
