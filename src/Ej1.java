import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para saber si es par o impar: ");
        int numero = Integer.parseInt(teclado.nextLine());

        if (numero < 0) {
            System.out.println("El numero introducido es negativo");
        } else if (numero % 2 == 0) {
            System.out.println("El numero introducido es par");
        } else {
            System.out.println("El numero introducido es impar");
        }
    }
}
