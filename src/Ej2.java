import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce primer numero");
        int num1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce segundo numero");
        int num2 = Integer.parseInt(teclado.nextLine());

        if (num1 == num2) {
            System.out.println("El primer numero introducido es igual al segundo");
        } else if (num1 > num2) {
            System.out.println("El primer numero introducido es mayor al segundo");
        } else {
            System.out.println("El primer numero introducido es menor al segundo");
        }
    }
}
