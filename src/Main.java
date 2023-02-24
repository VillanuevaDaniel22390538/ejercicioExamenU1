import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir los dos numeros enteros a evaluar
        System.out.print("Introduce el primer número: ");
        int N1 = input.nextInt();
        System.out.print("Introduce el segundo número: ");
        int N2 = input.nextInt();

        // Calcular la diferencia entre los números
        int diferencia = Math.abs(N1 - N2);

        // Comprobar si la diferencia entre ambos números es un divisor exacto o no.
        if (N1 % diferencia == 0 && N2 % diferencia == 0) {
            System.out.println("La diferencia entre los números es un divisor exacto de ambos.");
        } else {
            System.out.println("La diferencia entre los números no es un divisor exacto de ambos.");
        }
    }
}
