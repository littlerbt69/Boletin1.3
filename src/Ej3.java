import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para saber si es multiplo de 2/3 o los dos: ");
        int numero = Integer.parseInt(teclado.nextLine());

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 2 y de 3");
        } else if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 2");
        } else if (numero % 3 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 3");
        }
    }
}
