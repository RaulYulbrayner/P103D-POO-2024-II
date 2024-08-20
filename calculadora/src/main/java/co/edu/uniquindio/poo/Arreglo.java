package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Arreglo {

    // Escribe un programa que reciba un arreglo de números enteros y calcule la
    // suma de todos sus elementos

    // Ingrese el valor arreglo
    public static int[] ingresarDatos(int tamanio) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[tamanio];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
           arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    // Imprima el arreglo
    public static void imprimirSuma(int suma) {
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }

    // Dado el arreglo sume
    public static int sumarElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    // Solicitar el tamaño del arreglo
    public static int ingresarTamanio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        return scanner.nextInt();
    }

    // Main
    public static void main(String[] args) {
        int tamanio = ingresarTamanio();
        int[] arreglo = ingresarDatos(tamanio);
        int suma = sumarElementos(arreglo);
        imprimirSuma(suma);
    }

}
