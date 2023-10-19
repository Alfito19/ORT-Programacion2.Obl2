package ClasesDominio;

public class Habilidad {
    private String nombre;
    private String descripcion;
    private int nivel;

    public Habilidad(){
        this.nombre="sin definir";
        this.descripcion ="sin definir";
        this.nivel=0;
    }
    public Habilidad(String unNombre,String unaDes){
        this.nombre=unNombre;
        this.descripcion = unaDes;
        this.nivel = 0;
    }
    public Habilidad(String unNombre,String unaDes,int level){
        this.nombre=unNombre;
        this.descripcion = unaDes;
        this.nivel = level;
    }

    public void setNivel(int level){
        this.nivel=level;
    }
    public int getNivel(){
        return this.nivel;
    }

    @Override
    public String toString(){
        return this.nombre + "(" + this.nivel + ")";
    }
}
