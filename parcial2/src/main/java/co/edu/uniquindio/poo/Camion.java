package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String placa, String marca, String modelo, double capacidadCarga) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCosto(Envio envio) {
        double costoPeajes = envio.getNumeroPeajes() * 12000;
        double costoPorDistancia = envio.getDistancia() * 7000;
        double costoPorPaquetes = 0;

        for (Paquete paquete : envio.getPaquetes()) {
            costoPorPaquetes += paquete.getPeso() * 1000;
        }

        return costoPeajes + costoPorDistancia + costoPorPaquetes;
    }

    // Setters y Getters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
