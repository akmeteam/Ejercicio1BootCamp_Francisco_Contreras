package ejercicios;
import java.util.Scanner;
public class FactorialDeUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        // Calcular el factorial
        int factorial = calcularFactorial(numero);
        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
        scanner.close();
    }
    /**
     * Calcula el factorial de un número dado.
     *
     * @param numero El número cuyo factorial se desea calcular.
     * @return El factorial del número.
     */
    public static int calcularFactorial(int numero) {
        int factorial = 1;

        // El factorial se calcula utilizando un bucle for
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}