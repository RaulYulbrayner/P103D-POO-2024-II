package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String cedula;
    private String correo;
    private String direccion;
    private List<Envio> envios;

    public Cliente(String nombre, String cedula, String correo, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.envios = new LinkedList<>();
    }

    /**
     * Método para calcular el costo total de todos los envíos
     */
    public double calcularCostoTotalEnvios() {
        double total = 0;
        for (Envio envio : envios) {
            total += envio.calcularCosto();
        }
        return total;
    }

    // Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }

    public void agregarEnvio(Envio envio) {
        envios.add(envio);
    }
}
