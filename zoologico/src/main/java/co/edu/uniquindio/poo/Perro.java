package co.edu.uniquindio.poo;

public class Perro extends Animal {

    /**
     * Metodo constructor de la clase perro
     * @param nombre
     * @param color
     * @param edad
     */
    public Perro(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }

    @Override
    public void comer() {
        System.out.println("Perro comiendo.....");
    }

    @Override
    public void sonido() {
        System.out.println("Guau Guau Guauuuuuuuu");
    }

    @Override
    public void dormir() {
        System.out.println("Perro zZzZzZ...");
    }

    @Override
    public String toString() {
        return "Perro:" + super.toString();
    }
    
}
