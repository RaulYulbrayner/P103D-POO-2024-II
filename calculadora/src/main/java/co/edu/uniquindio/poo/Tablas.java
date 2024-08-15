package co.edu.uniquindio.poo;

public class Tablas {


    public static void tablasMultiplicar(){
        for(int i = 1; i<=10; i++){
            System.out.println("La tabla de: " + i + " es:");
            for(int j = 1; j<=10; j++){
                System.out.println(i + " X " + j + " = " + (i*j));
            }
            System.out.println();   
        }
    }



    public static void main(String[] args) {
        tablasMultiplicar();
    }
    
}
