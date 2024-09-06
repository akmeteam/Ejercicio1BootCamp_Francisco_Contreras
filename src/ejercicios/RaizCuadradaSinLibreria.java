package ejercicios;
import java.util.Scanner;

public class RaizCuadradaSinLibreria {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese el número para calcular su raíz cuadrada: ");
        double numero = scanner.nextDouble();
        // Solicitar el margen de error al usuario
        System.out.print("Ingrese el margen de error deseado: ");
        double error = scanner.nextDouble();
        // Calcular y mostrar la raíz cuadrada aproximada con visualización animada
        double raizCuadrada = calcularRaizCuadradaConVisualizacion(numero, error);
        System.out.println("\nLa raíz cuadrada aproximada de " + numero + " es: " + raizCuadrada);
        scanner.close();
    }
    /**
     * Calcula la raíz cuadrada de un número utilizando aproximación y muestra el proceso.
     *
     * @param numero El número para calcular su raíz cuadrada.
     * @param error  El margen de error aceptable.
     * @return La raíz cuadrada aproximada del número.
     */
    public static double calcularRaizCuadradaConVisualizacion(double numero, double error) throws InterruptedException {
        double x = numero / 2; // Valor inicial (puede ser cualquier valor positivo)
        double anterior = 0;   // Valor previo de x para comparación
        System.out.println("\nProceso de cálculo de la raíz cuadrada:");
        // Aproximación iterativa con visualización
        while (Math.abs(x * x - numero) > error) {
            anterior = x;
            x = 0.5 * (x + numero / x);
            // Mostrar el estado actual de la aproximación
            System.out.printf("Aproximación actual: %.5f -> Nueva aproximación: %.5f\n", anterior, x);
            Thread.sleep(1000);  // Pausa de 1 segundo para efecto de animación
        }
        return x;
    }
}