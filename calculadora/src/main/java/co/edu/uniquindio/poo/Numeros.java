package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Numeros {

    //terminar si un numero es 0, es positivo o negativo
    public static String determinarNumero(int num){
        String resultado = "";
        if(num > 0){
            resultado = "El numero es positivo";
        }else if(num < 0){
            resultado = "El numero es negativo";
        }else if(num == 0) {
            resultado = "El numero es CERO";
        }
        return resultado;
    }

    //Imprimir
    public static void imprimir(String res){
        System.out.println(res);
    }

    //Ingresar
    public static int ingresarValor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor");
        int valor = scanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int num = ingresarValor();
        imprimir(determinarNumero(num));           
    }
    
}
