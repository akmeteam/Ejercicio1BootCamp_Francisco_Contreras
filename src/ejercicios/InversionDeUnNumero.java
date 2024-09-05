package ejercicios;

public class InversionDeUnNumero {
    public static void main(String[] args) {
        int numero = 2468;
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10; // Obtiene el ultimo digito.
            numeroInvertido = numeroInvertido * 10 + digito; // Agrega el digito al numero invertido.
            numero /= 10; // Elimina el ultimo digito del numero original.
        }
        //Muestra el numero invertido.
        System.out.println("El número invertido es: " + numeroInvertido);
    }
}
