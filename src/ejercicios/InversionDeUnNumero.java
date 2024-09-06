package ejercicios;
import java.util.Scanner;

public class InversionDeUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese un número para invertir: ");
        int numero = scanner.nextInt();
        // Mostrar el número invertido
        int numeroInvertido = invertirNumeroConVisualizacion(numero);
        System.out.println("\nEl número invertido es: " + numeroInvertido);
        scanner.close();
    }
    /**
     * Invierte un número y muestra el proceso paso a paso.
     *
     * @param numero El número a invertir.
     * @return El número invertido.
     */
    public static int invertirNumeroConVisualizacion(int numero) {
        int numeroOriginal = numero;
        int numeroInvertido = 0;
        System.out.println("\nProceso de inversión:");
        while (numero != 0) {
            int digito = numero % 10; // Obtiene el último dígito.
            numeroInvertido = numeroInvertido * 10 + digito; // Agrega el dígito al número invertido.
            // Imprime el estado actual del número invertido
            System.out.println("Número Original: " + numeroOriginal + " | Dígito: " + digito + " | Número Invertido: " + numeroInvertido);
            numero /= 10; // Elimina el último dígito del número original.
        }
        return numeroInvertido;
    }
}