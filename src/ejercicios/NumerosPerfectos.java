package ejercicios;
import java.util.Scanner;

public class NumerosPerfectos {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese un número para verificar si es un número perfecto: ");
        int numero = scanner.nextInt();
        // Verificar y mostrar el resultado con visualización animada
        boolean esPerfecto = esNumeroPerfectoConVisualizacion(numero);
        if (esPerfecto) {
            System.out.println("\n" + numero + " es un número perfecto.");
        } else {
            System.out.println("\n" + numero + " no es un número perfecto.");
        }
        scanner.close();
    }
    /**
     * Verifica si un número es perfecto y muestra el proceso de cálculo.
     *
     * @param numero El número a verificar.
     * @return Verdadero si el número es perfecto, falso en caso contrario.
     */
    public static boolean esNumeroPerfectoConVisualizacion(int numero) throws InterruptedException {
        int sumaDivisores = 0;
        System.out.println("\nProceso de cálculo de divisores:");
        // Iteramos desde 1 hasta la mitad del número
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
                // Mostrar el estado actual del cálculo
                System.out.println("Divisor: " + i + ", Suma de divisores actual: " + sumaDivisores);
                Thread.sleep(1000); // Pausa de 1 segundo para efecto de animación
            }
        }
        // Verificar si la suma de los divisores es igual al número
        return sumaDivisores == numero;
    }
}