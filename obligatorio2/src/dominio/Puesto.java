package dominio;
import java.io.Serializable;
import java.util.*;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class Puesto implements Serializable{
    private String nombre;
    //remoto,hibrido o presencial
    private String tipo;
    private ArrayList<Habilidad> temasRequeridos;

    public Puesto(){
        this.nombre = "";
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
    
    @Override
    public String toString(){
        return this.nombre;
    }

}
