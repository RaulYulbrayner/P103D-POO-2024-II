package co.edu.uniquindio.poo;

public class Televisor extends Dispositivo implements IEncender {

    private int tamanio;

    public Televisor(String nombre, int tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public void prender() {
        System.out.println("TV prendida");
    }

    @Override
    public void apagar() {
        System.out.println("TV apagada");
    }

    @Override
    public void importar() {
        System.out.println("TV importada");
    }

}
