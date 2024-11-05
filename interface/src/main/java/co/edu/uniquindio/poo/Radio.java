package co.edu.uniquindio.poo;

public class Radio extends Dispositivo implements IEncender{
    
    private int referencia;

    public Radio(String nomrbe, int referencia){
        super(nomrbe);
        this.referencia=referencia;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    @Override
    public void prender() {
        System.out.println("Radio prendida");
    }

    @Override
    public void apagar() {
        System.out.println("Radio apagada");
    }

    @Override
    public void importar() {
        System.out.println("Radio importada");
    }

    

}
