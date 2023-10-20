package dominio;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

import java.util.*;

public class Puesto{
    private String nombre;
    //remoto,hibrido o presencial
    private String tipo;
    private ArrayList<Habilidad> temasRequeridos;

    public Puesto(){
        this.nombre = "sd";
        this.tipo = "Remoto";
        this.temasRequeridos = new ArrayList<>();
    }

    public Puesto(String unNombre,String unTipo,ArrayList<Habilidad> skills){
        this.nombre = unNombre;
        this.tipo = unTipo;
        this.temasRequeridos = skills;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }
    public ArrayList<Habilidad> getTemasRequeridos(){
        return this.temasRequeridos;
    }

}
