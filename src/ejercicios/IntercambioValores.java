package ejercicios;
import java.util.Scanner;

public class IntercambioValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar los valores a y b al usuario
        System.out.print("Ingrese el valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int b = scanner.nextInt();
        // Mostrar los valores antes del intercambio
        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);
        // Visualización del proceso de intercambio
        System.out.println("\nProceso de intercambio:");
        mostrarProcesoIntercambio(a, b);
        // Realizar el intercambio
        int[] resultados = intercambiarValores(a, b);
        a = resultados[0];
        b = resultados[1];
        // Mostrar los valores después del intercambio
        System.out.println("\nDespués del intercambio: a = " + a + ", b = " + b);
        scanner.close();
    }
    /**
     * Intercambia los valores de dos variables utilizando operaciones aritméticas.
     *
     * @param a El primer valor.
     * @param b El segundo valor.
     * @return Un array que contiene los valores intercambiados.
     */
    public static int[] intercambiarValores(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }
    /**
     * Muestra el proceso de intercambio paso a paso.
     *
     * @param a El primer valor.
     * @param b El segundo valor.
     */
    public static void mostrarProcesoIntercambio(int a, int b) {
        System.out.println("Paso 1: a = a + b -> a = " + a + " + " + b + " -> a = " + (a + b));
        a = a + b;
        System.out.println("Paso 2: b = a - b -> b = " + a + " - " + b + " -> b = " + (a - b));
        b = a - b;
        System.out.println("Paso 3: a = a - b -> a = " + a + " - " + b + " -> a = " + (a - b));
        a = a - b;
    }
}
