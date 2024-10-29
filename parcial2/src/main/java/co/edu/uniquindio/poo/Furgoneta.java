package co.edu.uniquindio.poo;

public class Furgoneta extends Vehiculo {
    private String tipoTransmision;

    public Furgoneta(String placa, String marca, String modelo, String tipoTransmision) {
        super(placa, marca, modelo);
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public double calcularCosto(Envio envio) {
        double costoCombustible = envio.getDistancia() * 3000;
        double fleteFijo = 10000;
        return costoCombustible + fleteFijo;
    }

    // Setters y Getters
    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
}
