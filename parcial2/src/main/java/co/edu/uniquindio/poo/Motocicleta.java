package co.edu.uniquindio.poo;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String placa, String marca, String modelo, int cilindrada) {
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCosto(Envio envio) {
        int numeroPaquetes = envio.getPaquetes().size();
        double costo = 0;

        if (envio.getZonaEntrega() == ZonaEntrega.RURAL) {
            costo = 15000 * numeroPaquetes;
        } else {
            costo = 8000 * numeroPaquetes;
        }

        return costo;
    }

    // Getters y setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
