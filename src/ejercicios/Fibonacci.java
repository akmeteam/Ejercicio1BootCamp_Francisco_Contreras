package ejercicios;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número de términos al usuario
        System.out.print("Ingrese el número de términos de la serie Fibonacci a generar: ");
        int N = scanner.nextInt();
        // Generar la serie Fibonacci
        generarSerieFibonacci(N);
        scanner.close();
    }
    /**
     * Genera y muestra los primeros N números de la serie Fibonacci.
     *
     * @param N El número de términos de la serie Fibonacci a generar.
     */
    public static void generarSerieFibonacci(int N) {
        int num1 = 0, num2 = 1;
        // Muestra el resultado
        System.out.print("Los primeros " + N + " números de Fibonacci son: ");
        for (int i = 1; i <= N; ++i) {
            System.out.print(num1 + " ");
            // Actualiza los números para la siguiente iteración
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println();
    }
}