package ejercicios;

public class Fibonacci {
    public static void main(String[] args) {
        int N = 10;
        int num1 = 0, num2 = 1;
        //Muestra el resultado
        System.out.print("Los primeros " + N + " números de Fibonacci son: ");

        for (int i = 1; i <= N; ++i) {
            System.out.print(num1 + " ");
            // Actualiza los numeros para la siguiente iteracion
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
    }
}
