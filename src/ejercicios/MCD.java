package ejercicios;
import java.util.Scanner;

public class MCD {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número (b): ");
        int b = scanner.nextInt();
        System.out.println("Calculando el MCD (máximo común divisor) de " + a + " y " + b);
        // Encontrar el MCD con visualización animada
        int mcd = encontrarMCDConVisualizacion(a, b);
        // Mostrar el resultado
        System.out.println("\nEl MCD es: " + mcd);
        scanner.close();
    }
    /**
     * Encuentra el MCD de dos números utilizando el Algoritmo de Euclides, con visualización.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return El MCD de los dos números.
     */
    public static int encontrarMCDConVisualizacion(int a, int b) throws InterruptedException {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            // Mostrar el estado actual del proceso
            System.out.print("\nCalculando: a = " + a + ", b = " + b);
            Thread.sleep(2000); // Pausa de 2 segundo para efecto de animación
        }
        return a;
    }
}