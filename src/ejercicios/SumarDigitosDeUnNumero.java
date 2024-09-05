package ejercicios;

public class SumarDigitosDeUnNumero {
    public static void main(String[] args) {
        int numero = 1234;
        int suma = 0;

        while (numero != 0) {
            int digito = numero % 10; // Obtenemos el último dígito
            suma += digito; // Sumamos el dígito a la suma total
            numero /= 10; // Eliminamos el último dígito del número
        }

        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }
}
