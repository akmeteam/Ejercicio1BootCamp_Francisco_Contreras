package ejercicios;

public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero = 7;
        int limite = 10; // Puedes cambiar este valor para modificar el límite de la tabla
        System.out.println("Tabla de multiplicar del " + numero);
        for (int i = 1; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
