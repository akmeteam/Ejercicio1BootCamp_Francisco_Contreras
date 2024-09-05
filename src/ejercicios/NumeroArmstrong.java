package ejercicios;

public class NumeroArmstrong {
    public static void main(String[] args) {
        int numero = 152;
        int originalNumero = numero;
        int numeroDigitos = (int) Math.log10(numero) + 1; // Calcula el número de dígitos
        int suma = 0;

        while (numero != 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, numeroDigitos);
            numero /= 10;
        }
        if (suma == originalNumero) {
            System.out.println(originalNumero + " es un número de Armstrong.");
        } else {
            System.out.println(originalNumero + " no es un número de Armstrong.");
        }
    }
}
