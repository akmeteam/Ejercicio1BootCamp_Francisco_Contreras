package ejercicios;

public class ConteoDeDigitos {
    public static void main(String[] args) {
        int numero = 12345;
        int numeroOriginal = numero; // Guardamos el valor original del número
        int contador = 0;

        // Caso especial para el número 0
        if (numero == 0) {
            contador = 1;
        } else {
            // Dividimos entre 10 repetidamente hasta que el número sea 0
            while (numero != 0) {
                numero /= 10;
                contador++;
            }
        }

        System.out.println("El número " + numeroOriginal + " tiene " + contador + " dígitos.");
    }
}