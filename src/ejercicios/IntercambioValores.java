package ejercicios;

public class IntercambioValores {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);
        // Intercambio utilizando operaciones aritméticas
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Después del intercambio: a = " + a + ", b = " + b);
    }
}
