package ejercicios;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al generador de tablas de multiplicar!");
        while (true) {
            // Solicitar al usuario que ingrese el número
            System.out.print("Por favor, ingresa el número del cual deseas ver la tabla de multiplicar (o escribe 'salir' para terminar): ");
            String input = scanner.nextLine();
            // Opción para salir del programa
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("¡Gracias por usar el generador de tablas de multiplicar! Hasta la próxima.");
                break;
            }
            // Validar que el input sea un número
            int numero;
            try {
                numero = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
                continue; // Volver al inicio del bucle
            }
            // Solicitar al usuario que ingrese el límite
            System.out.print("¿Hasta qué número deseas multiplicar " + numero + "? ");
            int limite;
            try {
                limite = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un límite válido.");
                continue; // Volver al inicio del bucle
            }
            // Mostrar la tabla de multiplicar
            System.out.println("\nTabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= limite; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.println(); // Línea en blanco para mayor claridad
        }
        // Cerrar el escáner
        scanner.close();
    }
}