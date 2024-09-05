package ejercicios;

public class RaizCuadradaSinLibreria {
    public static void main(String[] args) {
        double numero = 4;
        double error = 0.00001; // Margen de error
        double x = numero / 2; // Valor inicial (puede ser cualquier valor positivo)

        while (Math.abs(x * x - numero) > error) {
            x = 0.5 * (x + numero / x);
        }
        System.out.println("La raíz cuadrada aprox. de " + numero + " es: " + x);
    }
}
