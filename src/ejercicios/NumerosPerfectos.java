package ejercicios;

public class NumerosPerfectos {
    public static void main(String[] args) {
        int numero = 18;
        int sumaDivisores = 0;
        // Iteramos desde 1 hasta la mitad del número
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        // Se verifica si la suma de los divisores es igual al número
        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }
}
