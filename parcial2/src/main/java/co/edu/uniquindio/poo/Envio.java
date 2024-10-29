package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Envio {
    private String codigoEnvio;
    private ZonaEntrega zonaEntrega;
    private String fechaEnvio;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private List<Paquete> paquetes;
    private int numeroPeajes;
    private double distancia;

    public Envio(String codigoEnvio, ZonaEntrega zonaEntrega, String fechaEnvio, Cliente cliente, Vehiculo vehiculo,
            int numeroPeajes, double distancia) {
        this.codigoEnvio = codigoEnvio;
        this.zonaEntrega = zonaEntrega;
        this.fechaEnvio = fechaEnvio;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroPeajes = numeroPeajes;
        this.distancia = distancia;
        this.paquetes = new LinkedList<>();
    }

    public void agregarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public double calcularCosto() {
        return vehiculo.calcularCosto(this);
    }

    // Setters y Getters
    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public ZonaEntrega getZonaEntrega() {
        return zonaEntrega;
    }

    public void setZonaEntrega(ZonaEntrega zonaEntrega) {
        this.zonaEntrega = zonaEntrega;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    public int getNumeroPeajes() {
        return numeroPeajes;
    }

    public void setNumeroPeajes(int numeroPeajes) {
        this.numeroPeajes = numeroPeajes;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
