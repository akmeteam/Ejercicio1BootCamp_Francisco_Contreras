package ejercicios;
import java.util.Scanner;

public class CalcularPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar la base al usuario
        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();
        // Solicitar el exponente al usuario
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        // Calcular la potencia
        int resultado = calcularPotencia(base, exponente);
        // Mostrar el resultado
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
        scanner.close();
    }
    /**
     * Calcula la potencia de un número dado una base y un exponente.
     *
     * @param base La base de la potencia.
     * @param exponente El exponente de la potencia.
     * @return El resultado de elevar la base al exponente.
     */
    public static int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1; // Cualquier número elevado a 0 es 1
        }
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}