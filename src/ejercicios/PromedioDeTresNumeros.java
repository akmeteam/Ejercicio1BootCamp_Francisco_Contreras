package ejercicios;

public class PromedioDeTresNumeros {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 11;
        // Aqui se realiza la suma de los tres números.
        int suma = a + b + c;
        // Aca se calcula el promedio (suma dividido entre la cantidad de números)
        double promedio = (double) suma / 3;
        //Aca se muestra el resultado.
        System.out.println("El promedio de " + a + ", " + b + " y " + c + " es: " + promedio);
    }
}
