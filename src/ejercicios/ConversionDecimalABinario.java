package ejercicios;
import java.util.Scanner;

public class ConversionDecimalABinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número decimal al usuario
        System.out.print("Ingrese un número decimal: ");
        int decimal = scanner.nextInt();
        // Calcular la conversión a binario
        String binario = convertirADecimal(decimal);
        // Mostrar el resultado
        System.out.println("El número decimal " + decimal + " en binario es: " + binario);
        scanner.close();
    }
    /**
     * Convierte un número decimal a binario.
     *
     * @param decimal El número decimal a convertir.
     * @return La representación binaria del número.
     */
    public static String convertirADecimal(int decimal) {
        if (decimal == 0) {
            return "0"; // Caso especial para el número 0
        }
        StringBuilder binario = new StringBuilder();
        int tempDecimal = decimal; // Para no modificar el valor original
        while (tempDecimal > 0) {
            int residuo = tempDecimal % 2;
            binario.insert(0, residuo);
            tempDecimal /= 2;
        }
        return binario.toString();
    }
}