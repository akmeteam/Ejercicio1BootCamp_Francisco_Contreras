package ejercicios;
import java.util.Scanner;

public class SumaDeNumerosParesEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al sumador de números pares!");
        // Solicitar el rango al usuario
        System.out.print("Por favor, ingresa el límite inferior del rango: ");
        int a = scanner.nextInt();
        System.out.print("Ahora, ingresa el límite superior del rango: ");
        int b = scanner.nextInt();
        int sumaPares = 0;
        // Calcular la suma de los números pares
        System.out.println("Calculando la suma de los números pares entre " + a + " y " + b + "...");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
                System.out.println("Sumando el número par: " + i);
            }
        }
        // Mostrar el resultado final
        System.out.println("¡Listo! La suma de los números pares entre " + a + " y " + b + " es: " + sumaPares);
        // Mensaje de despedida
        System.out.println("¡Gracias por usar el sumador de números pares!");
        // Cerrar el escáner
        scanner.close();
    }
}