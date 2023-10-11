import java.util.Scanner;

public class Ej5_ {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double suma = 0;
        int cantidadNumeros = 0;
        double numero;
        double media;

        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;

        System.out.println("Introduce 4 números. Si introduces un número negativo, el programa se detendrá.");

        while (cantidadNumeros < 4) {
            System.out.print("Introduce el número " + (cantidadNumeros + 1) + ": ");
            numero = teclado.nextDouble();

            if (numero < 0) {
                System.out.println("Número negativo ingresado. El programa se detiene.");
                break;
            }

            suma += numero;
            cantidadNumeros++;

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }
        }

        if (cantidadNumeros > 0) {
            media = suma / cantidadNumeros;
            System.out.println("La media de los números ingresados es: " + media);

            System.out.println("Número mayor:");
            if (maximo > media) {
                System.out.println(maximo);
            }

            System.out.println("Número menor:");
            if (minimo < media) {
                System.out.println(minimo);
            }
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

    }
}
