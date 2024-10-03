package co.edu.uniquindio.poo;

/**
 * La clase Calculadora proporciona una operación básica de división
 * Permite dividir dos números enteros, verificando que el divisor no sea cero
 */
public class Calculadora {

    /**
     * Realiza la división de dos números enteros.
     * Si el divisor es cero, se lanza una excepción de tipo ArithmeticException
     * 
     * @param a el dividendo, un número entero
     * @param b el divisor, un número entero
     * @throws ArithmeticException si b es igual a cero
     */
    public void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        System.out.println(a / b);
    }
}
