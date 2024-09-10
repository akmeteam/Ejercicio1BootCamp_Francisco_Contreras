package ejercicios;
import java.util.Scanner;

public class SumarDigitosDeUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al sumador de dígitos!");
        // Solicitar al usuario que ingrese un número
        System.out.print("Por favor, ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        // Guardamos el número original para mostrarlo después
        int numeroOriginal = numero;
        int suma = 0;
        // Calcular la suma de los dígitos
        System.out.println("Calculando la suma de los dígitos de " + numero + "...");
        while (numero != 0) {
            int digito = numero % 10; // Obtenemos el último dígito
            suma += digito; // Sumamos el dígito a la suma total
            System.out.println("Sumando el dígito: " + digito);
            numero /= 10; // Eliminamos el último dígito del número
        }
        // Mostrar el resultado final
        System.out.println("¡Listo! La suma de los dígitos de " + numeroOriginal + " es: " + suma);
        // Mensaje de despedida
        System.out.println("¡Gracias por usar el sumador de dígitos! Hasta la próxima.");
        // Cerrar el escáner
        scanner.close();
    }
}