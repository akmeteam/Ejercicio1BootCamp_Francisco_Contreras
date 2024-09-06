package ejercicios;
import java.util.Scanner;

public class AreaDeUnTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base del triángulo al usuario
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        // Solicitar la altura del triángulo al usuario
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área del triángulo
        double area = calcularArea(base, altura);

        // Mostrar el resultado
        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }

    /**
     * Calcula el área de un triángulo dada la base y la altura.
     *
     * @param base La base del triángulo.
     * @param altura La altura del triángulo.
     * @return El área del triángulo.
     */
    public static double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }
}