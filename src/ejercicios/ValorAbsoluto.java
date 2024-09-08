package ejercicios;
import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al calculador de valor absoluto!");
        while (true) {
            // Solicitar al usuario que ingrese un número
            System.out.print("Por favor, ingresa un número entero (o escribe 'salir' para terminar): ");
            String input = scanner.nextLine();
            // Opción para salir del programa
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("¡Gracias por usar el calculador de valor absoluto! Hasta la próxima.");
                break;
            }
            // Validar que el input sea un número
            int numero;
            try {
                numero = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número entero válido.");
                continue; // Volver al inicio del bucle
            }
            // Usando la función Math.abs()
            int valorAbsolutoMath = Math.abs(numero);
            System.out.println("El valor absoluto de " + numero + " usando Math.abs() es: " + valorAbsolutoMath);
            // Implementando el valor absoluto de forma personalizada
            int valorAbsolutoPersonalizado = (numero < 0) ? -numero : numero;
            System.out.println("El valor absoluto de " + numero + " calculado de forma personalizada es: " + valorAbsolutoPersonalizado);
            System.out.println(); // Línea en blanco para mayor claridad
        }
        // Cerrar el escáner
        scanner.close();
    }
}