package obligatorio2;

import dominio.*;
import interfaz.*;
public class Obligatorio2 {

    public static void main(String[] args) {
        Sistema controlador = new Sistema();
        Todo ventanas = new Todo(controlador);
    }
    
}
