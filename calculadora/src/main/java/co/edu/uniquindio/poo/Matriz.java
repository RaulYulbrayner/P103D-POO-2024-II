package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Matriz {

    //Metodo que solicite el tamaño de la matriz
    public static int ingresarDato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz:");
        int tamanio = scanner.nextInt();
        return tamanio;
    }

    //Metodo que dada una matriz marque con 1 la diagonal principal
    public static void digonalPrincipal(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i < j){
                    matriz[i][j] = 1;
                }
            }
        }
    }

    //Metodo para imprimir un matriz
    public static void imprimirMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //main
    public static void main(String[] args) {
        int tamanio = ingresarDato();
        int[][] matriz = new int[tamanio][tamanio];
        digonalPrincipal(matriz);
        imprimirMatriz(matriz);
        
    }
}
