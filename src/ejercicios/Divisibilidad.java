package ejercicios;
import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        // Verificar la divisibilidad
        verificarDivisibilidad(numero);
        scanner.close();
    }
    /**
     * Verifica la divisibilidad de un número por 2, 3 y 5, y muestra el resultado.
     *
     * @param numero El número a verificar.
     */
    public static void verificarDivisibilidad(int numero) {
        boolean esDivisible = false;
        if (numero % 2 == 0) {
            System.out.println(numero + " es divisible por 2.");
            esDivisible = true;
        }
        if (numero % 3 == 0) {
            System.out.println(numero + " es divisible por 3.");
            esDivisible = true;
        }
        if (numero % 5 == 0) {
            System.out.println(numero + " es divisible por 5.");
            esDivisible = true;
        }
        if (!esDivisible) {
            System.out.println(numero + " no es divisible por 2, 3 ni 5.");
        }
    }
}
