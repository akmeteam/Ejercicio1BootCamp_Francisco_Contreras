package ejercicios;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        int numero = 6;
        int factorial = 1;

        // El factorial se calcula utilizando un bucle for
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        //Aqui se muestra el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
