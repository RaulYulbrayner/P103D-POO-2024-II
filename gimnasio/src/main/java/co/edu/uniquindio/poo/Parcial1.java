package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Parcial1 {

    public static void main(String[] args) {
        Gimnasio gimnasio = new Gimnasio("Bodytech");

        // Se crean los miembros
        Miembro miembro1 = new Miembro("reconocer", 20, "Masculino", "12345", 311, Membresia.TRIMESTRAL);
        Miembro miembro2 = new Miembro("Carlos", 17, "Masculino", "31143", 311434446, Membresia.ANUAL);
        Miembro miembro3 = new Miembro("Camilaa", 17, "Femenino", "19985", 313, Membresia.ANUAL);

        // Se crean los entrenadores
        Entrenador entrenador = new Entrenador("Jorge", "Pesas", "1234", "jorge@gmail.com");
        Entrenador entrenador2 = new Entrenador("Jorge Mario", "Barras", "1264", "jorgem@gmail.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);
        gimnasio.agregarMiembro(miembro3);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(entrenador);
        gimnasio.agregarEntrenador(entrenador2);

        // Se vinculan los miembros al entrenador
        entrenador.agregarMiembroAEntrenador(miembro2);

        // --------------------Solución parcial 1------------------------

        // Punto A
        gimnasio.mostrarMensaje("El nombre del entrenador mas largo es: " + gimnasio.obtenerNombreEntrenadorMasLargo());

        // Punto B
        LinkedList<Miembro> miembroTelefono = gimnasio.agregarMiembroConSumaTelefono();
        System.out.println("Los miembros con la suma de 30 en su telefono son:");
        for (Miembro miembro : miembroTelefono) {
            System.out.println(miembro);
        }

        // Punto C
        LinkedList<Miembro> palindromos = gimnasio.agregarMiembrosPalindromos();
        System.out.println("Los miembros con nombres palindromos son:");
        for (Miembro miembro : palindromos) {
            System.out.println(miembro);
        }

        // --------------------Fin Solución parcial 1--------------------
    }

}
