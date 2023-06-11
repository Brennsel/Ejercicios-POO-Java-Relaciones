import entidad.*;

import java.time.LocalDate;
import java.util.Scanner;

public class SeguroMain {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("Brenda Argañaraz", 419145003L, "brennsell@gmail.com", 5401156789055L);
        Vehiculo vehiculo1 = new Vehiculo("Ford", "Ecosport", 2012, TipoDeVehiculo.PICKUP, "171543", "blanco");
        Poliza poliza1 = new Poliza(cliente1, vehiculo1, 1234, LocalDate.of(2023, 6, 10), LocalDate.of(2025, 6, 10), FormaDePago.TRANSFERENCIA, 1200000.0F, TipoDeCobertura.TOTAL, true, 100000.0F);

        Integer cuota;

        poliza1.contarCantDeCuotas();
        poliza1.crearCuotas();

        menu(poliza1);
    }

    public static void menu(Poliza poliza) {

        Integer opc, num;
        Float aux;

        do {
            System.out.println(">>>>>>COMPAÑIA DE SEGUROS<<<<<<<");
            System.out.println(">>>>>>>>>>>>>Menu<<<<<<<<<<<<<<<");
            System.out.println("1. MOSTRAR CUOTAS");
            System.out.println("2. MONTO DE DEUDA");
            System.out.println("3. PAGAR CUOTA");
            System.out.println("4. MOSTRAR POLIZA");
            System.out.println("5. SALIR");
            System.out.println("==================================");
            System.out.print("Seleccione una opcion: ");
            opc = leer.nextInt();
            System.out.println("==================================");

            switch (opc) {
                case 1:
                    poliza.mostrarCuotas();
                    break;

                case 2:
                    aux = poliza.sumarCuotasVencidad();
                    if (aux > 0) {
                        System.out.println("Adeuda: $" + aux);
                    } else {
                        System.out.println("No posee deuda");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese numero de cuota a pagar: ");
                    num = leer.nextInt();

                    poliza.pagarCuota(num);
                    break;

                case 4:
                    System.out.println(poliza);
                    break;

                case 5:
                    System.out.println("FIN");
                    break;

                default:
                    break;

            }
        } while (opc != 5);
    }
}
