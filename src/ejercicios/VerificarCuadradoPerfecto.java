package ejercicios;

public class VerificarCuadradoPerfecto {
    public static void main(String[] args) {
        int numero = 64;
        double raizCuadrada = Math.sqrt(numero);
        // Usamos Math.floor para truncar la parte decimal
        if (raizCuadrada - Math.floor(raizCuadrada) == 0) {
            System.out.println(numero + " es un cuadrado perfecto.");
        } else {
            System.out.println(numero + " no es un cuadrado perfecto.");
        }
    }
}
