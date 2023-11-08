package dominio;
import java.io.*;
import java.util.Formatter;

//Joaquin Hernandez (257620)
//Alfonso Saizar (305968)

public class ArchivoGrabacion {
    private Formatter out;
    public ArchivoGrabacion(String unNombre) {
        try {
            out = new Formatter(unNombre);
        }
        catch (FileNotFoundException e) {
            System.out.println("no se puede crear");
            System.exit(1);
        }
        catch (SecurityException e) {
            System.out.println("sin permisos");
            System.exit(1);
        }
    }
    public ArchivoGrabacion(String unNombre, boolean ext) {
     // si el parametro *viene en true, indica que se extiende
     // si es false, se sobreescribe
        try {
        FileWriter f = new FileWriter(unNombre, ext);
        out = new Formatter(f);
        }
        catch (IOException e) {
            System.out.println("no se puede crear/extender");
            System.exit(1);
        }
    }
    public void grabarLinea(String linea) {
        out.format("%s%n", linea);
    }
    public void cerrar() {
        out.close();
    }
}
