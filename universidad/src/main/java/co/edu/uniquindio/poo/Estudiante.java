package co.edu.uniquindio.poo;

public class Estudiante {

    public String id;
    public String nombre;
    public String apellidos;
    public String correo;
    public String telefono;
    public int edad;
    public int nota1;
    public int nota2;
    public int nota3;

    /**
     * Metodo constructor de la clase Estudiante
     * 
     * @param id
     * @param nombre
     * @param apellidos
     * @param correo
     * @param telefono
     * @param edad
     */
    public Estudiante(String id, String nombre, String apellidos, String correo, String telefono, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo
                + ", telefono=" + telefono + ", edad=" + edad + "]";
    }   

}