import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la primera marca de tiempo:");
        System.out.print("Horas: ");
        int horas1 = teclado.nextInt();
        System.out.print("Minutos: ");
        int minutos1 = teclado.nextInt();
        System.out.print("Segundos: ");
        int segundos1 = teclado.nextInt();

        // Verificar límites para la primera marca de tiempo
        if (horas1 < 0 || horas1 > 23 || minutos1 < 0 || minutos1 > 59 || segundos1 < 0 || segundos1 > 59) {
            System.out.println("La primera marca de tiempo tiene valores fuera de los límites válidos.");
            return;
        }

        System.out.println("Ingrese la segunda marca de tiempo:");
        System.out.print("Horas: ");
        int horas2 = teclado.nextInt();
        System.out.print("Minutos: ");
        int minutos2 = teclado.nextInt();
        System.out.print("Segundos: ");
        int segundos2 = teclado.nextInt();

        // Verificar límites para la segunda marca de tiempo
        if (horas2 < 0 || horas2 > 23 || minutos2 < 0 || minutos2 > 59 || segundos2 < 0 || segundos2 > 59) {
            System.out.println("La segunda marca de tiempo tiene valores fuera de los límites válidos.");
            return;
        }

        int totalSegundos1 = horas1 * 3600 + minutos1 * 60 + segundos1;
        int totalSegundos2 = horas2 * 3600 + minutos2 * 60 + segundos2;

        if (totalSegundos1 > totalSegundos2) {
            System.out.println("La primera marca de tiempo es mayor.");
        } else if (totalSegundos2 > totalSegundos1) {
            System.out.println("La segunda marca de tiempo es mayor.");
        } else {
            System.out.println("Ambas marcas de tiempo son iguales.");
        }
    }
}
