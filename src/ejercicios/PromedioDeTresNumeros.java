package ejercicios;
import java.util.Scanner;

public class PromedioDeTresNumeros {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar los tres números al usuario con preguntas interactivas
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = scanner.nextInt();
        // Calcular y mostrar el promedio con visualización animada
        double promedio = calcularPromedioConVisualizacion(a, b, c);
        System.out.println("\nEl promedio de " + a + ", " + b + " y " + c + " es: " + promedio);
        scanner.close();
    }
    /**
     * Calcula el promedio de tres números y muestra el proceso de cálculo.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @param c El tercer número.
     * @return El promedio de los tres números.
     */
    public static double calcularPromedioConVisualizacion(int a, int b, int c) throws InterruptedException {
        System.out.println("\nProceso de cálculo del promedio:");
        // Animación del proceso de suma
        System.out.print("Sumando " + a);
        Thread.sleep(1000);
        System.out.print(" + " + b);
        Thread.sleep(1000);
        System.out.print(" + " + c);
        Thread.sleep(1000);
        int suma = a + b + c;
        System.out.println(" = " + suma);
        // Animación del proceso de cálculo del promedio
        System.out.print("Calculando promedio: " + suma + " / 3");
        Thread.sleep(1000);
        double promedio = (double) suma / 3;
        System.out.println(" = " + promedio);
        return promedio;
    }
}
