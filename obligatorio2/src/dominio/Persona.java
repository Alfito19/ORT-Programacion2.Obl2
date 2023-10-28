package dominio;

//Joaquin Hernandez (257620)

import java.io.Serializable;

//Alfonso Saizar (305968)

public class Persona implements Comparable<Persona>, Serializable{
    private String nombre;
    private String cedula;
    private String direccion;

    public Persona(){
        this.nombre = "Sin definir";
        this.cedula = "0";
        this.direccion = "Sin definir";
    }

    public Persona(String unNombre,String unaCedula,String unaDireccion){
        this.nombre = unNombre;
        this.cedula = unaCedula;
        this.direccion = unaDireccion;
    }

    public String getNombre(){
        return this.nombre;
    }    
    public String getCedula(){
        return this.cedula;
    }
    public String getDireccion(){
        return this.direccion;
    }

    @Override
    public int compareTo(Persona o) {
        return Long.compare(Long.parseLong(this.getCedula()),Long.parseLong(o.getCedula()));
    }
    
    @Override
    public String toString(){
        return this.getNombre() + "(" + this.getCedula() + ")";
    }
}
