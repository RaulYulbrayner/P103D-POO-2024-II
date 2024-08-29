package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Curso {
    private String nombre;
    private double notaDef;
    public Profesor profesor;
    public Collection<Estudiante> estudiantes;

    /**
     * @param nombre
     * @param notaDef
     * @param profesor
     */
    public Curso(String nombre, Profesor profesor){
        this.nombre=nombre;
        this.profesor=profesor;
        estudiantes = new LinkedList<>();
    }


    public boolean verificarEstudiante(String id){
        boolean centinela = false;
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarEstudiante(Estudiante estudiante){
        if(!verificarEstudiante(estudiante.getId())){
            estudiantes.add(estudiante);
        }
    }

    public double calcularDefinitiva(String cod, double nota1, double nota2, double nota3){
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getId().equals(cod)){
                estudiante.setNota1(nota1);
                estudiante.setNota2(nota2);
                estudiante.setNota3(nota3);

                double resultado = (nota1+nota2+nota3)/3;
                return resultado;
            }
        }
        return -1;
    }

    public void eliminarEstudiante(String id){
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getId().equals(id)){
                estudiantes.remove(estudiante);
                break;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaDef() {
        return notaDef;
    }

    public void setNotaDef(double notaDef) {
        this.notaDef = notaDef;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + ", notaDef=" + notaDef + ", profesor=" + profesor + ", estudiantes="
                + estudiantes + "]";
    }

}
