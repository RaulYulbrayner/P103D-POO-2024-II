package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Perro perro = new Perro("Bruno", "Amarillo", 2);
        System.out.println(perro.toString());
        perro.dormir();
        perro.comer();
        perro.sonido();

        System.out.println("-----------------------------");

        Gato gato = new Gato("Tom", "Negro", 5);
        System.out.println(gato.toString());
        gato.comer();
        gato.sonido();
        gato.dormir();

    }
}
