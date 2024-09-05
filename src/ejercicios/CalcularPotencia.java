package ejercicios;

public class CalcularPotencia {
    public static void main(String[] args) {
        int base = 8;
        int exponente = 2;
        int resultado = 1;
        // Se utiliza un bucle for para multiplicar la base por sí misma el número de veces indicado por el exponente
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a la " + exponente + " es: " + resultado);
    }
}
