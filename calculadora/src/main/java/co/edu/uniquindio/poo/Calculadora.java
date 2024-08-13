package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Calculadora {

    /**
     * Metodo que permite sumar dos valores
     * @param valor del numero 1
     * @param valor del numero 2
     * @return resultado de la suma de dos valores
     */
    public static double sumar(int numA, int numB) {
        int resaultado = numA + numB;
        return resaultado;
    }

    public static double restar(int numA, int numB) {
        double resaultado = numA - numB;
        return resaultado;
    }

    public static double multiplicar(int numA, int numB) {
        double resaultado = numA * numB;
        return resaultado;
    }

    public static double dividir(int numA, int numB) {
        double resaultado = numA / numB;
        return resaultado;
    }

    public static void calcular(int opcion, int numA, int numB) {
        switch (opcion) {
            case 1:
                System.out.println(sumar(numA, numB));
                break;
            case 2:
                System.out.println(restar(numA, numB));
                break;
            case 3:
                System.out.println(multiplicar(numA, numB));
                break;
            case 4:
                System.out.println(dividir(numA, numB));
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor seleccione la opcion que desea realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = scanner.nextInt();

        System.out.println("Ingrese el valor 1");
        int numA = scanner.nextInt() ;

        System.out.println("Ingrese el valor 2");
        int numB = scanner.nextInt();

        calcular(opcion, numA, numB);
    }

    /*public static void main(String[] args) {
        int numA = 2;
        int numB = 5;
        int c = 10;
        calcular(3, numA, numB);
    }*/

}
