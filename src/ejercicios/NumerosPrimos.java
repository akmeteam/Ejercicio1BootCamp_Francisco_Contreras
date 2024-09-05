package ejercicios;

public class NumerosPrimos {
    public static void main(String[] args) {
        int a = 30;
        boolean esPrimo = true;

        // Para poder verificar desde 2 hasta la raíz cuadrada de a
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                esPrimo = false;
                break;
            }
        }
        //Muestra el resultado.
        if (esPrimo) {
            System.out.println(a + " es un número primo.");
        } else {
            System.out.println(a + " no es un número primo.");
        }
    }
}
