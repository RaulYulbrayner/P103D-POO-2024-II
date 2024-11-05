package co.edu.uniquindio.poo;

public abstract class Dispositivo {
    private String nombre;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void importar();

}
