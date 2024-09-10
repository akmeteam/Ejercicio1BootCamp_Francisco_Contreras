package ejercicios;
import java.util.Scanner;

public class SumaDeDosNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();
        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();
        // Calcular la suma
        int suma = a + b;
        // Mostrar el resultado de la suma
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        // Cerrar el scanner
        scanner.close();
    }
}