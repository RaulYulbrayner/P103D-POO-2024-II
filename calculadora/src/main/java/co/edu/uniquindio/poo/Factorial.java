package co.edu.uniquindio.poo;

public class Factorial {

    /**
     * Metodo que permite calcular el factorial de un numero
     * @param num
     * @return 
     */
    public static int factorial(int num){
        int resultado =1;
        for(int i =1; i<=num; i++){
            resultado*=i;
        }
        return resultado;
    }

    /**
     * Metodo que permite imprimir un mensaje
     * @param num
     * @param resultado
     */
    public static void imprimir(int num, int resultado){
        System.out.println("El resultado del numero " + num + " es: " + resultado);
    }
    
    public static void main(String[] args) {
        int num = 15;
        imprimir(num, factorial(num));
    }
}
