package ejercicios;

public class MCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("Calculando el MCD(maximo comun divisor) de " + a + " y " + b);
        // Algoritmo de Euclides
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("El MCD es: " + a);
    }
}
