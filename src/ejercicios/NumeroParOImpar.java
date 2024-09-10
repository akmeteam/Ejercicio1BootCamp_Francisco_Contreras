package ejercicios;
import java.util.Scanner;

public class NumeroParOImpar {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese un número para verificar si es par o impar: ");
        int numero = scanner.nextInt();
        // Verificar y mostrar el resultado con visualización animada
        verificarParOImparConVisualizacion(numero);
        scanner.close();
    }
    /**
     * Verifica si un número es par o impar y muestra el proceso de verificación.
     *
     * @param numero El número a verificar.
     */
    public static void verificarParOImparConVisualizacion(int numero) throws InterruptedException {
        System.out.println("\nVerificando...");
        // Visualización animada
        Thread.sleep(1000);  // Pausa de 1 segundo para efecto de animación
        System.out.print("3");
        Thread.sleep(1000);  // Pausa de 1 segundo para efecto de animación
        System.out.print(" 2");
        Thread.sleep(1000);  // Pausa de 1 segundo para efecto de animación
        System.out.print(" 1");
        Thread.sleep(1000);  // Pausa de 1 segundo para efecto de animación
        System.out.println("...!");
        // Verificar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("\n" + numero + " es un número par.");
        } else {
            System.out.println("\n" + numero + " es un número impar.");
        }
    }
}