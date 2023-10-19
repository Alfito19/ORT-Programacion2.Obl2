package ClasesDominio;

public class Persona {
    private String nombre;
    private long cedula;
    private String direccion;

    public Persona(){
        this.nombre="Sin definir";
        this.cedula=0;
        this.direccion="Sin definir";
    }

    public Persona(String unNombre,long unaCedula,String unaDireccion){
        this.nombre=unNombre;
        this.cedula=unaCedula;
        this.direccion=unaDireccion;
    }

    public String getNombre(){
        return this.nombre;
    }    
    public long getCedula(){
        return this.cedula;
    }
    public String getDireccion(){
        return this.direccion;
    }
}
