package ejercicios;
import java.util.Scanner;

public class PalindromoDeUnNumero {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese un número para verificar si es palíndromo: ");
        int numero = scanner.nextInt();
        // Verificar y mostrar el resultado con visualización animada
        boolean esPalindromo = esNumeroPalindromoConVisualizacion(numero);
        if (esPalindromo) {
            System.out.println("\n" + numero + " es un palíndromo.");
        } else {
            System.out.println("\n" + numero + " no es un palíndromo.");
        }
        scanner.close();
    }
    /**
     * Verifica si un número es palíndromo y muestra el proceso de inversión.
     *
     * @param numero El número a verificar.
     * @return Verdadero si el número es palíndromo, falso en caso contrario.
     */
    public static boolean esNumeroPalindromoConVisualizacion(int numero) throws InterruptedException {
        int numeroOriginal = numero;
        int numeroInvertido = 0;
        System.out.println("\nProceso de inversión del número:");
        // Invertimos el número
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            // Mostrar el estado actual de la inversión
            System.out.println("Dígito: " + digito + ", Número invertido actual: " + numeroInvertido);
            Thread.sleep(1000);  // Pausa de 1 segundo para efecto de animación
            numero /= 10;
        }
        // Comparamos el número original con el invertido
        if (numeroOriginal == numeroInvertido) {
            return true;
        } else {
            return false;
        }
    }
}