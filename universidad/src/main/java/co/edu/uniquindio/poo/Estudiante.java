package co.edu.uniquindio.poo;

public class Estudiante {

    public String id;
    public String nombre;
    public String apellidos;
    public String correo;
    public String telefono;
    public int edad;
    public double nota1;
    public double nota2;
    public double nota3;

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
    public Estudiante(String id, String nombre, String apellidos, String correo, String telefono, int edad, double nota1, double nota2, double nota3) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
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

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public double getNota3(){
        return nota3;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public void setNota3(double nota3){
        this.nota3 = nota3;
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

    public static double promedioNotas(double nota1, double nota2, double nota3){
        return (nota1+nota2+nota3)/3;
    }

    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo=" + correo
                + ", telefono=" + telefono + ", edad=" + edad + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
                + nota3 + " el promedio de notas es: " + promedioNotas(nota1, nota2, nota3) +"]";
    }

     

}