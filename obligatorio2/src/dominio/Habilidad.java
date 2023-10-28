package dominio;

//Joaquin Hernandez (257620)

import java.io.Serializable;
import java.util.Objects;

//Alfonso Saizar (305968)

public class Habilidad implements Serializable {
    private String nombre;
    private String descripcion;
    private int nivel;

    public Habilidad(){
        this.nombre="sin definir";
        this.descripcion ="sin definir";
        this.nivel=0;
    }
    public Habilidad(String unNombre,String unaDes){
        this.nombre = unNombre;
        this.descripcion = unaDes;
        this.nivel = 0;
    }
    public Habilidad(String unNombre,String unaDes,int level){
        this.nombre = unNombre;
        this.descripcion = unaDes;
        this.nivel = level;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setNivel(int level){
        this.nivel = level;
    }
    public int getNivel(){
        return this.nivel;
    }

    @Override
    public String toString(){
        String vuelta = this.nombre;
        if (this.nivel!=0){
            vuelta+= " (" + this.nivel + ")";
        }
        return vuelta;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habilidad habilidad = (Habilidad) o;
        return Objects.equals(nombre, habilidad.nombre);
    }
}
