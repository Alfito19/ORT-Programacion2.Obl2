package ClasesDominio;

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
