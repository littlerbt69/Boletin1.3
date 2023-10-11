import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un carácter (+, -, *, /): ");
        char operador = teclado.next().charAt(0);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = teclado.nextInt();

        double resultado;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("La suma es: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("La resta es: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("La multiplicación es: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                    System.out.println("La división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Error: Operador no válido.");
        }
    }
}
