package dominio;

import java.util.*;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class Postulante extends Persona{
    private String telefono;
    private String mail;
    private String linkedIn;
    private String formato;
    private ArrayList<Habilidad> habilidades;
    private ArrayList<Integer> puntajesEntrevistas;

    public Postulante(){
        super();
        this.telefono = "0";
        this.mail = "sin definir";
        this.linkedIn = "sin definir";
        this.formato = "sin definir";
        this.habilidades = new ArrayList<>();
        this.puntajesEntrevistas = new ArrayList<>();
    }

    public Postulante(String unNombre,String unaCedula,String unaDireccion,String unTel,String unMail,String link,String unFormato,ArrayList<Habilidad> habs){
        super(unNombre,unaCedula,unaDireccion);
        this.telefono = unTel;
        this.mail = unMail;
        this.linkedIn = link;
        this.formato = unFormato;
        this.habilidades = habs;
        this.puntajesEntrevistas = new ArrayList<>();
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public String getFormato() {
        return formato;
    }

    public ArrayList<Integer> getPuntajesEntrevistas() {
        return puntajesEntrevistas;
    }
    
    public ArrayList<Habilidad> getHabilidades(){
        return this.habilidades;
    }
    
    public ArrayList<String> darHabilidades(){
        ArrayList<String> listaAux = new ArrayList<>();
        Iterator<Habilidad> it = this.getHabilidades().iterator();
        while(it.hasNext()){
            listaAux.add(it.next().toString());
        }
        return listaAux;
    }

    public ArrayList<Integer> getPuntajes(){
        return this.puntajesEntrevistas;
    }

    public void agregarPuntaje(int puntaje){
        this.puntajesEntrevistas.add(puntaje);
    }
    
    public int compara(Postulante otroP){
        return otroP.getPuntajes().get(otroP.getPuntajes().size()-1) - this.getPuntajes().get(this.getPuntajes().size()-1);
    }
}
