package ejercicios;

public class CalcularAreaDeCirculo {
    public static void main(String[] args) {
        double radio = 1; // Este es el radio del circulo.
        double pi = Math.PI;
        //Aqui se calcula.
        double area = pi * Math.pow(radio, 2);
        //Aqui se muestra el resultado.
        System.out.println("El área del círculo con radio " + radio + " es de: " + area);
    }
}
