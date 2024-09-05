package ejercicios;

public class PalindromoDeUnNumero {
    public static void main(String[] args) {
        int numero = 6464;
        int numeroOriginal = numero;
        int numeroInvertido = 0;

        // Invertimos el numero
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
        // Comparamos el numero original con el invertido
        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " es un palindromo.");
        } else {
            System.out.println(numeroOriginal + " no es un palindromo.");
        }
    }
}
