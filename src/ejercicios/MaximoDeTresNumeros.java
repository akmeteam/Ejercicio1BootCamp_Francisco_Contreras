package ejercicios;
import java.util.Scanner;

public class MaximoDeTresNumeros {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número (b): ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el tercer número (c): ");
        int c = scanner.nextInt();
        // Mostrar el proceso de comparación de manera entretenida
        int maximo = encontrarMaximo(a, b, c);
        // Mostrar el resultado
        System.out.println("\nEl número mayor es: " + maximo);
        scanner.close();
    }
    /**
     * Encuentra el máximo de tres números con visualización entretenida.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @param c El tercer número.
     * @return El número máximo.
     */
    public static int encontrarMaximo(int a, int b, int c) throws InterruptedException {
        int maximo = a;
        System.out.println("\nComparando números...");
        // Visualización animada del proceso de comparación
        System.out.print("Comparando " + a + " y " + b + ": ");
        Thread.sleep(1000); // Pausa de 1 segundo para efecto de animación
        if (b > maximo) {
            maximo = b;
            System.out.println(b + " es mayor");
        } else {
            System.out.println(a + " es mayor");
        }
        System.out.print("Comparando " + maximo + " y " + c + ": ");
        Thread.sleep(1000); // Pausa de 1 segundo para efecto de animación
        if (c > maximo) {
            maximo = c;
            System.out.println(c + " es mayor");
        } else {
            System.out.println(maximo + " es mayor");
        }
        return maximo;
    }
}