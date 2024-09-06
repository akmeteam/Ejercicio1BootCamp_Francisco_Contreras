package ejercicios;

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class CalcularAreaDeCirculo {

    public static void main(String[] args) {
        // Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo
        double area = PI * pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es de: " + area);

        // Cierre del scanner
        scanner.close();
    }
}