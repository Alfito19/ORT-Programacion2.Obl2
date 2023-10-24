package obligatorio2;

import dominio.*;
import interfaz.*;
public class Obligatorio2 {

    public static void main(String[] args) {
        Sistema controlador = new Sistema();
        Todo ventanas = new Todo(controlador);
        //hay que cambiar la clase todo y que solo habra menú, y desde ahí inicializar las otras ventanas
        Menu vent = new Menu(controlador);
        vent.setVisible(true);
    }
    
}
