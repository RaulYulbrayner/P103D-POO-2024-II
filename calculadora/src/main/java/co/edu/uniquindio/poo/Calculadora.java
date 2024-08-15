package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Calculadora {

    /**
     * Metodo que permite sumar dos valores
     * 
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

    public static void calcular(char opcion, int numA, int numB) {
        switch (opcion) {
            case '+':
                System.out.println(sumar(numA, numB));
                break;
            case '-':
                System.out.println(restar(numA, numB));
                break;
            case '*':
                System.out.println(multiplicar(numA, numB));
                break;
            case '/':
                System.out.println(dividir(numA, numB));
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {

        boolean activo = true;

        while (activo) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor seleccione la opcion que desea realizar");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            char opcion = scanner.nextLine().charAt(0);

            if (opcion=='+' || opcion=='-' || opcion=='*' || opcion=='/') {
                System.out.println("Ingrese el valor 1");
                int numA = scanner.nextInt();

                System.out.println("Ingrese el valor 2");
                int numB = scanner.nextInt();

                calcular(opcion, numA, numB);
            }
            if(opcion=='5'){
                activo = false;
                System.out.println("Chaoooooooooooo....");
            }

        }

    }

    /*
     * public static void main(String[] args) {
     * int numA = 2;
     * int numB = 5;
     * int c = 10;
     * calcular(3, numA, numB);
     * }
     */

}
