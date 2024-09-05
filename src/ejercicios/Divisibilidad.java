package ejercicios;

public class Divisibilidad {
    public static void main(String[] args) {
        int numero = 42;
        // Verificamos la divisibilidad por cada número
        if (numero % 2 == 0) {
            System.out.println(numero + " es divisible por 2.");
        }
        if (numero % 3 == 0) {
            System.out.println(numero + " es divisible por 3.");
        }
        if (numero % 5 == 0) {
            System.out.println(numero + " es divisible por 5.");
        }
        // Si ninguna de las condiciones anteriores se cumple, entonces no es divisible por ninguno
        if (numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0) {
            System.out.println(numero + " no es divisible por 2, 3 ni 5.");
        }
    }
}
