package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {

    public static void imprimir(String mensaje){
        System.out.println(mensaje);
    }


    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("11", "Raul", "Rivera", "ryrivera@uniquindio.edu.co", "3111", 30, 2, 2, 2);

        imprimir(estudiante.getNombre());

        

        estudiante.setNombre("Carlos");

        imprimir(estudiante.toString());

    }
}
