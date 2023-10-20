package dominio;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class Evaluador extends Persona{
    private long ingreso;

    public Evaluador(){
        super();
        this.ingreso = 0;
    }

    public Evaluador(String unNombre,long unaCedula,String unaDireccion,long unIngreso){
        super(unNombre,unaCedula,unaDireccion);
        this.ingreso = unIngreso;
    }
}
