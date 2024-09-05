package ejercicios;

public class SumaDeLosPrimerosNNumerosNaturales {
    public static void main(String[] args) {
        int N = 50;
        // Formula de Gauss: suma = N * (N + 1) / 2
        int suma = N * (N + 1) / 2;
        //Aqui muestra el resultado.
        System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
    }
}
