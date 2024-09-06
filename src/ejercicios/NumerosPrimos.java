package ejercicios;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese un número para verificar si es primo: ");
        int numero = scanner.nextInt();
        // Verificar y mostrar el resultado con visualización animada
        boolean esPrimo = esNumeroPrimoConVisualizacion(numero);
        if (esPrimo) {
            System.out.println("\n" + numero + " es un número primo.");
        } else {
            System.out.println("\n" + numero + " no es un número primo.");
        }
        scanner.close();
    }
    /**
     * Verifica si un número es primo y muestra el proceso de verificación.
     *
     * @param numero El número a verificar.
     * @return Verdadero si el número es primo, falso en caso contrario.
     */
    public static boolean esNumeroPrimoConVisualizacion(int numero) throws InterruptedException {
        // Caso especial para números menores o iguales a 1
        if (numero <= 1) {
            return false;
        }
        System.out.println("\nProceso de verificación:");
        // Para poder verificar desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Mostrar el estado actual del proceso
            System.out.print("Verificando divisibilidad por " + i + "... ");
            Thread.sleep(1000);  // Pausa de 1 segundo para efecto de animación
            if (numero % i == 0) {
                System.out.println("¡" + i + " es un divisor!");
                return false;
            } else {
                System.out.println(i + " no es un divisor.");
            }
        }
        return true;
    }
}