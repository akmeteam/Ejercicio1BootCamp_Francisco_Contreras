package ejercicios;
import java.util.Scanner;

public class NumeroArmstrong {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número al usuario
        System.out.print("Ingrese un número para verificar si es un Número Armstrong: ");
        int numero = scanner.nextInt();
        // Verificar y mostrar el resultado con visualización animada
        boolean esArmstrong = esNumeroArmstrongConVisualizacion(numero);
        if (esArmstrong) {
            System.out.println(numero + " es un número de Armstrong.");
        } else {
            System.out.println(numero + " no es un número de Armstrong.");
        }
        scanner.close();
    }
    /**
     * Verifica si un número es un Número Armstrong y muestra el proceso de cálculo.
     *
     * @param numero El número a verificar.
     * @return Verdadero si el número es un Número Armstrong, falso en caso contrario.
     */
    public static boolean esNumeroArmstrongConVisualizacion(int numero) throws InterruptedException {
        int originalNumero = numero;
        int numeroDigitos = (int) Math.log10(numero) + 1; // Calcula el número de dígitos
        int suma = 0;
        System.out.println("\nProceso de verificación:");
        while (numero != 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, numeroDigitos);
            // Mostrar el estado actual del cálculo
            System.out.println("Dígito: " + digito + ", Suma actual: " + suma);
            Thread.sleep(3000); // Pausa de 3 segundos para efecto de animación
            numero /= 10; // Eliminamos el último dígito
        }
        return suma == originalNumero;
    }
}
