import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String estadoCivil;
        int edad = 0;

        do {
            System.out.print("Ingrese el estado civil (S-Soltero, C-Casado, V-Viudo, D-Divorciado): ");
            estadoCivil = teclado.next();

            // Validar si el estado civil ingresado es válido
            if (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
                System.out.println("Estado civil no válido. Por favor, ingrese uno de los valores permitidos.");
            }

        } while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d"));

        System.out.print("Ingrese la edad: ");
        edad = teclado.nextInt();

        if ((estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("d")) && edad < 35) {
            System.out.println("El porcentaje de retención es de: 12.0%");
        } else if (edad >= 50) {
            System.out.println("El porcentaje de retención es de: 8.5%");
        } else if ((estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("c")) && edad < 35) {
            System.out.println("El porcentaje de retención es de: 11.3%");
        } else {
            System.out.println("El porcentaje de retención es de: 10.5%");
        }
    }
}
