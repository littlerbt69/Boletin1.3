import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char caracter = teclado.next().charAt(0);

        caracter = Character.toUpperCase(caracter);

        if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            int posicion;
            if (caracter == 'A') {
                posicion = 1;
            } else if (caracter == 'E') {
                posicion = 2;
            } else if (caracter == 'I') {
                posicion = 3;
            } else if (caracter == 'O') {
                posicion = 4;
            } else {
                posicion = 5;
            }
            System.out.println("Es la " + obtenerOrdinal(posicion) + " vocal (" + caracter + ")");
        } else {
            System.out.println("No es una vocal.");
        }
    }

    public static String obtenerOrdinal(int posicion) {
        if (posicion >= 1 && posicion <= 5) {
            String[] ordinales = {"primera", "segunda", "tercera", "cuarta", "quinta"};
            return ordinales[posicion - 1];
        } else {
            return "posición desconocida";
        }
    }
}
