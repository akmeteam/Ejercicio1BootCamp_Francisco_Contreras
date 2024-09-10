package ejercicios;
import java.util.Scanner;

public class ConversionDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar la temperatura en Celsius al usuario
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        // Calcular la conversión a Fahrenheit
        double fahrenheit = convertirACelsius(celsius);
        // Mostrar el resultado
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
        scanner.close();
    }
    /**
     * Convierte una temperatura de Celsius a Fahrenheit.
     *
     * @param celsius La temperatura en Celsius.
     * @return La temperatura en Fahrenheit.
     */
    public static double convertirACelsius(double celsius) {
        // Fórmula de conversión: Fahrenheit = (Celsius * 9/5) + 32
        return (celsius * 9 / 5) + 32;
    }
}