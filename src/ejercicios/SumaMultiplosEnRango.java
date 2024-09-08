package ejercicios;
import java.util.Scanner;

public class SumaMultiplosEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al sumador de múltiplos!");
        // Solicitar al usuario el número del cual quiere sumar los múltiplos
        System.out.print("Por favor, ingresa el número del cual deseas sumar los múltiplos: ");
        int numero = scanner.nextInt();
        // Solicitar el rango al usuario
        System.out.print("Ahora, ingresa el límite inferior del rango: ");
        int rangoInicio = scanner.nextInt();
        System.out.print("Y finalmente, ingresa el límite superior del rango: ");
        int rangoFin = scanner.nextInt();
        int suma = 0;
        // Calcular la suma de los múltiplos
        System.out.println("Calculando la suma de los múltiplos de " + numero + " entre " + rangoInicio + " y " + rangoFin + "...");
        for (int i = rangoInicio; i <= rangoFin; i++) {
            if (i % numero == 0) {
                suma += i;
                System.out.println("Sumando el múltiplo: " + i);
            }
        }
        // Mostrar el resultado final
        System.out.println("¡Listo! La suma de los múltiplos de " + numero + " entre " + rangoInicio + " y " + rangoFin + " es: " + suma);
        // Mensaje de despedida
        System.out.println("¡Gracias por usar el sumador de múltiplos! Hasta la próxima.");
        // Cerrar el escáner
        scanner.close();
    }
}