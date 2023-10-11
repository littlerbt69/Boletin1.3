import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroMinimo = Integer.MAX_VALUE;
        int numeroMaximo = Integer.MIN_VALUE;


        // Solicitar al usuario que ingrese 4 números
        System.out.println("Ingrese cuatro números:");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();
        double num4 = teclado.nextDouble();

        // Actualizar el número mínimo y el número máximo
        if (num1 < numeroMinimo) {
            numeroMinimo = (int) num1;
        }
        if (num1 > numeroMaximo) {
            numeroMaximo = (int) num1;
        }
        if (num2 < numeroMinimo) {
            numeroMinimo = (int) num2;
        }
        if (num2 > numeroMaximo) {
            numeroMaximo = (int) num2;
        }
        if (num3 < numeroMinimo) {
            numeroMinimo = (int) num3;
        }
        if (num3 > numeroMaximo) {
            numeroMaximo = (int) num3;
        }
        if (num4 < numeroMinimo) {
            numeroMinimo = (int) num4;
        }
        if (num4 > numeroMaximo) {
            numeroMaximo = (int) num4;
        }

        // Calcular la media de los números ingresados
        double media = (num1 + num2 + num3 + num4) / 4;

        // Imprimir la media
        System.out.println("La media de los números es: " + media);

        // Imprimir el número mínimo y el número máximo
        System.out.println("El número mínimo es: " + numeroMinimo);
        System.out.println("El número máximo es: " + numeroMaximo);
    }
}
