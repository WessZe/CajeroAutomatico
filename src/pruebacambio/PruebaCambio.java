package pruebacambio;

import java.util.Scanner;

public class PruebaCambio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidad;

        System.out.print("Bienvenidos Ingrese la cantidad a desglosar: ");
        cantidad = entrada.nextInt();

        int[] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] desglose = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < billetes.length; i++) {
            if (cantidad >= billetes[i]) {
                desglose[i] =(cantidad / billetes[i]);
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
//El cajero automati