package co.edu.uniquindio.poo;

public class Gato extends Animal {

    public Gato(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }

    @Override
    public void comer() {
        System.out.println("Gato comiendo.....");
    }

    @Override
    public void sonido() {
        System.out.println("Miau Miau Miau Miauuuuuuuuu");
    }

    @Override
    public void dormir() {
        System.out.println("Gato zZzZzZ...");
    }

    @Override
    public String toString() {
        return "Gato:" + super.toString();
    }

}
