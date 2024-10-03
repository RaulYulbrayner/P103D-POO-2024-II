package co.edu.uniquindio.poo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Clase Empresa
 */
public class Empresa {

    // Lista de empleados que pertenece a la empresa
    private List<Empleado> empleados;

    /**
     * Constructor de la clase Empresa.
     * Inicializa la lista de empleados como un ArrayList vacío.
     */
    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    /**
     * Metodo que permite agregar un nuevo empleado a la lista de empleados de la
     * empresa
     * 
     * @param empleado el empleado a agregar
     */
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Obtiene una lista de empleados cuya edad es mayor a 30 años.
     * Recorre la lista de empleados y filtra aquellos con una edad mayor a 30.
     * 
     * @return una lista de empleados mayores de 30 años
     */
    public List<Empleado> obtenerEmpleadosMayoresDe30() {
        return empleados.stream()
                .filter(empleado -> empleado.getEdad() > 30)
                .collect(Collectors.toList());
    }

}
