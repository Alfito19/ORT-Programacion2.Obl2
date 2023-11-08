package dominio;
import java.io.Serializable;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class Evaluador extends Persona implements Serializable{
    private long ingreso;

    public Evaluador(){
        super();
        this.ingreso = 0;
    }

    public Evaluador(String unNombre,String unaCedula,String unaDireccion,long unIngreso){
        super(unNombre,unaCedula,unaDireccion);
        this.ingreso = unIngreso;
    }
}
