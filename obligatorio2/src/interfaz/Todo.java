package interfaz;
import dominio.*;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)


public class Todo {
    private AltaPostulante altaPostulante;
    private BajaPostulante bajaPostulante;
    private ConsultaParaPuesto consultaParaPuesto;
    private HistoriaPostulante historiaPostulante;
    private IngresoEntrevista ingresoEntrevista;
    private Menu menu;
    private RegistroEvaluador registroEvaluador;
    private RegistroPuesto registroPuesto;
    private RegistroTematica registroTematica;

    public Todo(Sistema unSistema) {
        this.altaPostulante = new AltaPostulante(unSistema);
        this.bajaPostulante = new BajaPostulante(unSistema);
        this.consultaParaPuesto = new ConsultaParaPuesto(unSistema);
        this.historiaPostulante = new HistoriaPostulante(unSistema);
        this.ingresoEntrevista = new IngresoEntrevista(unSistema);
        this.menu = new Menu(unSistema);
        this.registroEvaluador = new RegistroEvaluador(unSistema);
        this.registroPuesto = new RegistroPuesto(unSistema);
        this.registroTematica = new RegistroTematica(unSistema);
    }
    
    
}
