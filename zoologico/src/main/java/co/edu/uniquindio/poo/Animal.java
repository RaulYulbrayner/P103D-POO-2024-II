package co.edu.uniquindio.poo;

public abstract class Animal {
    private String nombre, color;
    private int edad;

    /**
     * Metodo constructor de la clase animal
     * 
     * @param nombre
     * @param color
     * @param edad
     */
    public Animal(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    /**
     * Metodo que permite definir la forma de comer de los animales
     */
    public abstract void comer();

    /**
     * Metodo que permite definir la forma de hacer sonido de los animales
     */
    public abstract void sonido();

    /**
     * Metodo que permite definir la forma de dormir de los animales
     */
    public abstract void dormir();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "[nombre=" + nombre + ", color=" + color + ", edad=" + edad + "]";
    }

}
