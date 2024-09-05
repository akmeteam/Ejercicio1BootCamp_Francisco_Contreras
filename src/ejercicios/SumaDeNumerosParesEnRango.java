package ejercicios;

public class SumaDeNumerosParesEnRango {
    public static void main(String[] args) {
        int a = 1, b = 10;
        int sumaPares = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            }
        }
        System.out.println("La suma de los números pares entre " + a + " y " + b + " es: " + sumaPares);
    }
}
