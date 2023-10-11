import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su edad: ");
        int edad = Integer.parseInt(teclado.nextLine());

        if (edad >= 0 && edad <= 12) {
            System.out.println("La persona es un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("La persona es un adolescente.");
        } else if (edad >= 18 && edad <= 29) {
            System.out.println("La persona es un joven.");
        } else if (edad >= 30 && edad < 100) {
            System.out.println("La persona es un adulto.");
        } else {
            System.out.println("Edad fuera del rango válido.");
        }
    }

}
