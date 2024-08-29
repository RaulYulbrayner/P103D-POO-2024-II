package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Quiz {

    /*
     * Escribe un método en Java que reciba un número
     * entero positivo y calcule la suma de todos los
     * números iniciado en 1 hasta el número ingresado
     * ej: numero ingresado 5, el resultado es: 15 12345
     */

    public static int sumaNumeros(int num) {
        int suma = 0;
        for (int i = 0; i <= num; i++) {
            suma += i;
        }
        return suma;
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        int dato = scanner.nextInt();
        return dato;
    }

    public static void main(String[] args) {
        int num = ingresarEntero("Ingrese el dato");
        System.out.println(sumaNumeros(num));
    }

}
