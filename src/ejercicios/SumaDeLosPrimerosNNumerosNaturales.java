package ejercicios;
import java.util.Scanner;

public class SumaDeLosPrimerosNNumerosNaturales {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese el valor de N
        System.out.print("¿Cuántos números naturales deseas sumar? Ingresa un número: ");
        int N = scanner.nextInt();
        // Verificar que N sea un número positivo
        if (N < 1) {
            System.out.println("Por favor, ingresa un número natural mayor que 0.");
        } else {
            // Fórmula de Gauss: suma = N * (N + 1) / 2
            int suma = N * (N + 1) / 2;
            // Mostrar el resultado de la suma
            System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
            // Mensaje motivacional
            System.out.println("¡Excelente trabajo! Nos vemos pronto.");
        }
        // Cerrar el scanner
        scanner.close();
    }
}