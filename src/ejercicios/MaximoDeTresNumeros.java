package ejercicios;

public class MaximoDeTresNumeros {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 13;
        int maximo;

        // Aqui es donde se encuentra el mayor usando condiciones anidadas
        if (a >= b && a >= c) {
            maximo = a;
        } else if (b >= a && b >= c) {
            maximo = b;
        } else {
            maximo = c;
        }

        System.out.println("El número mayor es: " + maximo);
    }
}
