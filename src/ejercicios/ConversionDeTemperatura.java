package ejercicios;

public class ConversionDeTemperatura {
    public static void main(String[] args) {
        double celsius = 25;
        // Formula de conversion: Fahrenheit = (Celsius * 9/5) + 32
        double fahrenheit = (celsius * 9/5) + 32;
        //Aqui muestra el resultado.
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}
