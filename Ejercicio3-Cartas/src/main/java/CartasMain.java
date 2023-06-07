/*
. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */

import entidad.Carta;
import servicio.BarajaServicio;

import java.util.List;
import java.util.Scanner;

public class CartasMain {
    public static void main(String[] args) {

        BarajaServicio bs = new BarajaServicio();

        bs.crearBaraja();
        menu(bs);
    }

    public static void menu(BarajaServicio bs) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;

        do{
            System.out.println(">>>>>>>>>>>>>CARTAS ESPAÑOLAS<<<<<<<<<<<<<<<<");
            System.out.println("~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. BARAJAR");
            System.out.println("2. VER LA SIGUIENTE CARTA");
            System.out.println("3. VER CANTIDAD DE CARTAS DISPONIBLES");
            System.out.println("4. REPARTIR CARTAS");
            System.out.println("5. MOSTRAR CARTAS QUE HAN SALIDO");
            System.out.println("6. VER CARTAS DISPONIBLES");
            System.out.println("7. MOSTRAR MAZO");
            System.out.println("8. FINALIZAR JUEGO");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Seleccione una opcion: ");
            opc = leer.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch (opc) {
                case 1:
                    bs.barajar();
                    break;

                case 2:
                    Carta carta;
                    carta = bs.siguienteCarta();
                    if (carta != null) {
                        System.out.println("La siguiente carta es: " + carta);
                    } else{
                        System.out.println("Fin de la baraja");
                    }
                    break;

                case 3:
                    int a;
                    a = bs.cartasDisponibles();
                    System.out.println("La cantidad de cartas disponibles es " + a);
                    break;

                case 4:
                    List<Carta> lista;
                    lista = bs.darCartas();

                    if(lista!=null){

                        System.out.println("Las cartas repartidas son: ");
                        System.out.println(lista);
                    }else{
                        System.out.println("La cantidad ingresada supera a la cantidad de cartas disponibles.");
                    }
                    break;

                case 5:
                    bs.cartasMonton();
                    break;

                case 6:
                    bs.mostrarBaraja();
                    break;

                case 7:
                    bs.mostrarMazo();
                    break;

                case 8:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Ingreso incorrecto");
            }

        } while(opc!=8);
    }
}
