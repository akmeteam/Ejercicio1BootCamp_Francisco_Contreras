package ejercicios;
import java.util.Scanner;

public class ConteoDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        // Calcular el número de dígitos
        int contador = contarDigitos(numero);
        // Mostrar el resultado
        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");
        scanner.close();
    }
    /**
     * Cuenta el número de dígitos en un número entero.
     *
     * @param numero El número cuyo dígitos se desean contar.
     * @return El conteo de dígitos.
     */
    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1; // Caso especial para el número 0
        }
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }
}