package ejercicios;
import java.util.Scanner;

public class VerificarCuadradoPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al verificador de cuadrados perfectos!");
        while (true) {
            // Solicitar al usuario que ingrese un número
            System.out.print("Por favor, ingresa un número entero positivo (o escribe 'salir' para terminar): ");
            String input = scanner.nextLine();
            // Opción para salir del programa
            if (input.equalsIgnoreCase("salir")) {
                System.out.println("¡Gracias por usar el verificador de cuadrados perfectos! Hasta la próxima.");
                break;
            }
            // Validar que el input sea un número
            int numero;
            try {
                numero = Integer.parseInt(input);
                if (numero < 0) {
                    System.out.println("Por favor, ingresa un número entero positivo.");
                    continue; // Volver al inicio del bucle
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número entero válido.");
                continue; // Volver al inicio del bucle
            }
            // Calcular la raíz cuadrada
            double raizCuadrada = Math.sqrt(numero);
            // Verificar si es un cuadrado perfecto
            if (raizCuadrada == Math.floor(raizCuadrada)) {
                System.out.println("¡Felicidades! " + numero + " es un cuadrado perfecto. Su raíz cuadrada es " + (int)raizCuadrada + ".");
            } else {
                System.out.println("Lo siento, " + numero + " no es un cuadrado perfecto. Su raíz cuadrada es aproximadamente " + raizCuadrada + ".");
            }
            System.out.println(); // Línea en blanco para mayor claridad
        }
        // Cerrar el escáner
        scanner.close();
    }
}