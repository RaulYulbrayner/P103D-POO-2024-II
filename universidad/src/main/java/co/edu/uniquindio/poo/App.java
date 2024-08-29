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

        Profesor profesor = new Profesor("Raul", "Rivera", 109400000, "Auxiliar");

        Curso curso = new Curso("Programación I", profesor);

        Estudiante estudiante = new Estudiante("111", "Juliana", "Toro", "juliana@uniquindio.edu.co", "3111", 30);

        Estudiante estudiante2 = new Estudiante("112", "Ana", "Gomez", "ana@uniquindio.edu.co", "3111", 30);

        //Agregar estudiantes al curso
        curso.agregarEstudiante(estudiante);
        curso.agregarEstudiante(estudiante2);

        //Calcular nota definitiva
        System.out.println(curso.calcularDefinitiva("111", 2, 4, 3));

        System.out.println(curso.calcularDefinitiva("112", 1, 2, 1));


        System.out.println(curso);

        //Eliminar un estudiante
        curso.eliminarEstudiante("111");

        System.out.println(curso);

    }
}
