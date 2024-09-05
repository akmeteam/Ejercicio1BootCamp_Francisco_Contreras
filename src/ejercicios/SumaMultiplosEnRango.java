package ejercicios;

public class SumaMultiplosEnRango {
    public static void main(String[] args) {
        int numero = 3;
        int rangoInicio = 1;
        int rangoFin = 50;
        int suma = 0;
        for (int i = rangoInicio; i <= rangoFin; i++) {
            if (i % numero == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los múltiplos de " + numero + " entre " + rangoInicio + " y " + rangoFin + " es: " + suma);
    }
}
