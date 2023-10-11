import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el tipo de producto (A, B o C): ");
        char tipoProducto = teclado.next().charAt(0);

        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = teclado.nextDouble();

        double precioRebajado = calcularPrecioRebajado(tipoProducto, precioOriginal);

        if (precioRebajado >= 0) {
            System.out.println("El precio rebajado es: " + precioRebajado + "€");
        } else {
            System.out.println("Error: Tipo de producto no válido o precio original negativo.");
        }
    }

    public static double calcularPrecioRebajado(char tipoProducto, double precioOriginal) {
        double precioRebajado = 0.0;

        if (precioOriginal < 0 || (tipoProducto != 'A' && tipoProducto != 'B' && tipoProducto != 'C')) {
            return -1; // Valor inválido
        }

        switch (tipoProducto) {
            case 'A':
                precioRebajado = precioOriginal - (precioOriginal * 0.07);
                break;
            case 'C':
                if (precioOriginal < 500) {
                    precioRebajado = precioOriginal - (precioOriginal * 0.12);
                } else {
                    precioRebajado = precioOriginal - (precioOriginal * 0.09);
                }
                break;
            default:
                precioRebajado = precioOriginal - (precioOriginal * 0.09);
        }

        return precioRebajado;
    }
}
