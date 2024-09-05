package ejercicios;

public class ValorAbsoluto {
    public static void main(String[] args) {
        int numero = -15;
        // Usando la función Math.abs()
        int valorAbsolutoMath = Math.abs(numero);
        System.out.println("El valor absoluto de " + numero + " usando Math.abs() es: " + valorAbsolutoMath);
        // Implementando el valor absoluto de forma personalizada
        int valorAbsolutoPersonalizado = (numero < 0) ? -numero : numero;
        System.out.println("El valor absoluto de " + numero + " calculado al ojimetro es: " + valorAbsolutoPersonalizado);
    }
}
