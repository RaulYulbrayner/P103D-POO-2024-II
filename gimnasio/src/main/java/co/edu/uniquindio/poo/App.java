package co.edu.uniquindio.poo;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Se crea el gimnasio
        Gimnasio gimnasio = new Gimnasio("Bodytech");

        // Se crean los miembros
        Miembro miembro1 = new Miembro("Carlosito", 20, "Masculino", "12345", Membresia.MENSUAL);
        Miembro miembro2 = new Miembro("Maro", 17, "Masculino", "1235", Membresia.ANUAL);
        Miembro miembro3 = new Miembro("Camilaa", 17, "Femenino", "19985", Membresia.ANUAL);

        // Se crean los entrenadores
        Entrenador entrenador = new Entrenador("Jorge", "Pesas", "1234", "jorge@gmail.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(entrenador);

        // Se vinculan los miembros al entrenador
        entrenador.agregarMiembroAEntrenador(miembro2);

        // Devolver lista con nombre invertidos
        gimnasio.mostrarMensaje("Lista Nombres Invertidos");
        gimnasio.listaNombresInverso();

        // Obtener los miembros menores de edad
        LinkedList<Miembro> menores = gimnasio.miembrosMenoresEdad();

        // Imprimir los miembros menores de edad
        System.out.println("Miembros menores de edad:");
        for (Miembro miembro : menores) {
            System.out.println(miembro);
        }

        // Calcular edad promedio
        gimnasio.mostrarMensaje("La edad promedio es: " + gimnasio.calcularPromedioEdad());

        // Eliminar nombre por cantidad de vocales
        gimnasio.eliminarNombreVocales();

        // Moda
        gimnasio.mostrarMensaje("La Moda de edades: " + gimnasio.modaEdades());

        System.out.println(gimnasio);

    }
}
