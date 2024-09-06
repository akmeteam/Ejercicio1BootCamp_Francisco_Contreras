package ejercicios;
import java.util.Scanner;

public class ProductoDeDosNumeros {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        // Calcular y mostrar el producto con visualización animada
        int producto = calcularProductoConVisualizacion(a, b);
        System.out.println("\nEl producto de " + a + " y " + b + " es: " + producto);
        scanner.close();
    }
    /**
     * Calcula el producto de dos números y muestra el proceso de cálculo.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return El producto de los dos números.
     */
    public static int calcularProductoConVisualizacion(int a, int b) throws InterruptedException {
        int producto = a * b;
        int resultadoParcial = 0;
        System.out.println("\nProceso de cálculo del producto:");
        // Animación del proceso de multiplicación
        for (int i = 1; i <= b; i++) {
            resultadoParcial += a;
            System.out.println(a + " * " + i + " = " + resultadoParcial);
            Thread.sleep(1000);  // Pausa de 1 segundo para efecto de animación
        }
        return producto;
    }
}