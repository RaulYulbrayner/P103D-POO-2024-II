package co.edu.uniquindio.poo;

/**
 * La clase Empleado representa a un empleado con un nombre y una edad.
 * Proporciona métodos para obtener la edad y comparaciones entre empleados.
 */
public class Empleado {

    // Atributos privados
    private String nombre;
    private int edad;

    /**
     * Constructor que inicializa un objeto Empleado con un nombre y una edad.
     * 
     * @param nombre el nombre del empleado
     * @param edad   la edad del empleado
     */
    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Metodo que obtiene la edad del empleado
     * 
     * @return la edad del empleado
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo que retorna la representación del objeto Empleado.
     * 
     * @return el nombre del empleado
     */
    @Override
    public String toString() {
        return nombre;
    }

    /**
     * Compara si dos empleados son iguales.
     * Dos empleados se consideran iguales si tienen el mismo nombre y edad.
     * 
     * @param obj el objeto a comparar con este empleado
     * @return true si los empleados tienen el mismo nombre y edad, de lo contrario
     *         false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Empleado empleado = (Empleado) obj;
        return edad == empleado.edad && nombre.equals(empleado.nombre);
    }

    /**
     * Metodo que genera un valor hash basado en el nombre y la edad del empleado.
     * Este valor es utilizado para optimizar la búsqueda en estructuras de datos
     * como hash tables.
     * 
     * @return el valor hash del empleado
     */
    @Override
    public int hashCode() {
        return nombre.hashCode() + edad;
    }

}
