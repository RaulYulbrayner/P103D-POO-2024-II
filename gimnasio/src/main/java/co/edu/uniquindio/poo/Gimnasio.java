package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Gimnasio {
    private String nombre;
    private LocalDate fechaInscripcion;
    private LinkedList<Miembro> miembros;
    private LinkedList<Entrenador> entrenadores;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        miembros = new LinkedList<>();
        entrenadores = new LinkedList<>();
    }

    public void agregarMiembro(Miembro miembro) {
        if (!verificarMiembro(miembro.getCedula())) {
            miembros.add(miembro);
        }
    }

    public boolean verificarMiembro(String cedula) {
        boolean centinela = false;
        for (Miembro miembro : miembros) {
            if (miembro.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarEntrenador(Entrenador entrenador) {
        if (!verificarEntrenador(entrenador.getCorreo())) {
            entrenadores.add(entrenador);
        }
    }

    public boolean verificarEntrenador(String correo) {
        boolean centinela = false;
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void eliminarMiembro(String cedula) {
        for (Miembro miembro : miembros) {
            if (miembro.getCedula().equals(cedula)) {
                miembros.remove(miembro);
                break;
            }
        }
    }

    public void eliminarEntrenador(String correo) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                entrenadores.remove(entrenador);
                break;
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // --------------------------------------------------------------
    // Pilas metodos nuevos del taller

    /**
     * Metodo que muestra los nombres de los miembros de la lista en orden inverso
     */
    public void listaNombresInverso() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            mostrarMensaje(miembro.getNombre());
        }
    }

    /**
     * Metodo que crea una lista de miembros que son menores de 18 años.
     * 
     * @return Una lista de objetos cuya edad es menor de 18 años.
     */
    public LinkedList<Miembro> miembrosMenoresEdad() {
        LinkedList<Miembro> menores = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menores.add(miembro);
            }
        }
        return menores;
    }
    // --------------------------------------------------------------

    /**
     * Metodo para calcular la edad promedio
     * 
     * @return la edad
     */
    public int calcularPromedioEdad() {
        int sumatoria = 0;
        for (Miembro miembro : miembros) {
            sumatoria += miembro.getEdad();
        }
        sumatoria /= miembros.size();
        return sumatoria;
    }

    public boolean determiarVocal(char letra) {
        String vocales = "aeiouAEIOU";
        if (vocales.indexOf(letra) != -1) {
            return true;
        }
        return false;
    }

    public boolean determiarVocal2(char letra) {
        boolean centinela = false;
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            centinela = true;
        }
        return centinela;
    }

    // ---------------------
    /**
     * Determinar vocal
     * 
     * @param nombre
     * @return
     */
    private int determinarVocal(String nombre) {
        int contador = 0;
        char[] vocales = nombre.toLowerCase().toCharArray();
        for (char vocal : vocales) {
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                contador += 1;
            }
        }
        return contador;
    }

    /**
     * eliminar nombre por vocales
     */
    public void eliminarNombreVocales2() {
        for (Miembro miembro : miembros) {
            if (determinarVocal(miembro.getNombre()) >= 3) {
                miembros.remove(miembro);
            }
        }
    }

    public void eliminarNombreVocales() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            int cantidadVocales = 0;
            char[] chars = miembro.getNombre().toCharArray();
            for (char letra : chars) {
                if (determiarVocal2(letra)) {
                    cantidadVocales += 1;
                }
            }
            if (cantidadVocales >= 3) {
                miembros.remove(i);
            }
        }
    }

    public int determinarVocal(Miembro miembro) {
        int contador = 0;
        String nombre = miembro.getNombre();
        for (int i = 0; i < nombre.length(); i++) {
            char c = nombre.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' ||
                    c == 'O' | c == 'U') {
                contador++;
            }
        }
        return contador;
    }

    public void EliminarNombreVocales() {
        for (Miembro miembro : miembros) {
            if (determinarVocal(miembro) >= 3) {
                miembros.remove(miembro);
            }
        }
    }

    public int modaEdades() {
        int moda = -1;
        int maxFrecuencia = 0;

        for (int i = 0; i < miembros.size(); i++) {
            int edadActual = miembros.get(i).getEdad();
            int frecuencia = 0;

            // Contar cuántas veces aparece la edad actual
            for (int j = 0; j < miembros.size(); j++) {
                if (miembros.get(j).getEdad() == edadActual) {
                    frecuencia++;
                }
            }

            // Actualizar la moda si la frecuencia actual es mayor que la anterior
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = edadActual;
            }
        }

        return moda;
    }

    // --------------------Solución parcial 1------------------------

    /**
     * Método que devuelva el nombre más largo entre todos los entrenadores del
     * gimnasio.
     */
    public String obtenerNombreEntrenadorMasLargo() {
        String nombreMasLargo = entrenadores.get(0).getNombre();
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getNombre().length() > nombreMasLargo.length()) {
                nombreMasLargo = entrenador.getNombre();
            }
        }
        return nombreMasLargo;
    }

    /**
     * Método que agregue a una lista los nombres de aquellos miembros cuyo número
     * de teléfono, al sumar los dígitos, sea igual a 30. Ejemplo: "Juan" tiene el
     * número de teléfono 311434446, la suma de los dígitos (3+1+1+4+3+4+4+4+6) es
     * 30.
     * 
     * @return lista de miembros que los digitos suman 30
     */
    public LinkedList<Miembro> agregarMiembroConSumaTelefono() {
        LinkedList<Miembro> miembrosConSuma = new LinkedList<>();

        for (Miembro miembro : miembros) {
            int telefono = miembro.getTelefono();
            int sumaDigitos = 0;

            for (int i = telefono; i > 0; i /= 10) {
                sumaDigitos += i % 10; 
            }

            if (sumaDigitos == 30) {
                miembrosConSuma.add(miembro);
            }
        }
        return miembrosConSuma;
    }

    /**
     * Método que agregue a una lista los nombres de los miembros que son
     * palíndromos. Un nombre es considerado palíndromo si se lee de la misma manera
     * de izquierda a derecha y de derecha a izquierda. ej: reconocer, ana.
     * 
     * @return lista de miembros con nombres palindromos
     */
    public LinkedList<Miembro> agregarMiembrosPalindromos() {
        LinkedList<Miembro> miembrosPalindromos = new LinkedList<>();
        for (Miembro miembro : miembros) {
            String nombre = miembro.getNombre();
            int longitud = nombre.length();
            boolean esPalindromo = true;

            for (int i = 0; i < longitud / 2; i++) {
                if (nombre.charAt(i) != nombre.charAt(longitud - i - 1)) {
                    esPalindromo = false;
                    break;
                }
            }

            if (esPalindromo) {
                miembrosPalindromos.add(miembro);
            }
        }
        return miembrosPalindromos;
    }

    // --------------------Fin Solución parcial 1--------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", fechaInscripcion=" + fechaInscripcion + ", miembros=" + miembros
                + ", entrenadores=" + entrenadores + "]";
    }

}
