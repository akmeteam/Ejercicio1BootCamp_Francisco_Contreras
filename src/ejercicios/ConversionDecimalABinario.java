package ejercicios;

public class ConversionDecimalABinario {
    public static void main(String[] args) {
        int decimal = 3;
        String binario = "";
        //Convierte.
        while (decimal > 0) {
            int residuo = decimal % 2;
            binario = residuo + binario;
            decimal /= 2;
        }
        //Muestra el resultado.
        System.out.println("El número decimal " + decimal + " en binario es: " + binario);
    }
}
