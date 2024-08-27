package co.edu.uniquindio.poo;

public class Profesor {

    private String nombre;
    private String apellido;
    private int cedula;
    private String categoria;

    public Profesor(String nombre, String apellido, int cedula, String categoria){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.categoria=categoria;
    }

    @Override
    public String toString() {
        return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", categoria="
                + categoria + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
}
