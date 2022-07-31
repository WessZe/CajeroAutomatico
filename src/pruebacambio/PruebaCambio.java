package pruebacambio;

import java.util.Scanner;

public class PruebaCambio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);

        int cantidad;
        int seleccion;
        int comodin=0;

        do {
            System.out.println("Porfavor seleccion una opcion");
            System.out.println("    1. Consulta de saldo");
            System.out.println("    2. Retiro de efectivo");
            System.out.println("    3. Deposito de efectivo");
            System.out.println("    4. Historial de transacciones");
            System.out.println("    5. Salir del Sistema");
            seleccion = opcion.nextInt();

            if (seleccion >= 1 && seleccion <= 5) {
                comodin = 1;
            } else {
                System.out.println("------------------------------------------");
                System.out.println("Opcion No Disponible, Vuelva a intentar");
                System.out.println("------------------------------------------");
            }
        } while (comodin == 0);



        System.out.print("Bienvenidos Ingrese la cantidad a desglosar: ");
        cantidad = entrada.nextInt();

        int[] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] desglose = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < billetes.length; i++) {
            if (cantidad >= billetes[i]) {
                desglose[i] = (cantidad / billetes[i]);
                cantidad = cantidad - (desglose[i] * billetes[i]);
            }
        }
        System.out.println("    ***Desglose***    ");
        for (int i = 0; i < billetes.length; i++) {
            if (desglose[i] > 0) {
                if (billetes[i] > 0) {
                    System.out.println(" Billetes de " + billetes[i] + " LPS: " + desglose[i]);

                }
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Muchas Gracias por usar nuestros servicios");
        System.out.println("-------------------------------------------");
    }

}
