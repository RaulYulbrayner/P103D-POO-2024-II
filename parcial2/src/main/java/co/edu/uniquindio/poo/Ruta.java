package co.edu.uniquindio.poo;

public class Ruta {
    private int numeroPeajes;

    public Ruta(int numeroPeajes) {
        this.numeroPeajes = numeroPeajes;
    }

    // Getters y Setters
    public int getNumeroPeajes() {
        return numeroPeajes;
    }

    public void setNumeroPeajes(int numeroPeajes) {
        this.numeroPeajes = numeroPeajes;
    }

    @Override
    public String toString() {
        return "Ruta: " + numeroPeajes + " peajes";
    }
}
