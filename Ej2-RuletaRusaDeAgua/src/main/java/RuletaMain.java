import entidad.Juego;
import entidad.Jugador;
import entidad.Revolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RuletaMain {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static List<Jugador> jugadores = new ArrayList<>();

    public static void main(String[] args) {

        boolean terminar = false;
        int ronda = 1;
        Jugador jugadorMojado;

        Juego juego = new Juego();
        Revolver revolver = new Revolver();

        revolver.llenarRevolver();
        juego.llenarJuego(jugadores, revolver);
        cargarJugadores();

        do {
            System.out.println("----------------RONDA " + ronda + "----------------");
            jugadorMojado = juego.ronda();

            if (jugadorMojado != null) {
                System.out.println("Fin del juego");
                System.out.println("Se ha mojado: " + jugadorMojado.getNombre());
                terminar = true;
            } else {
                System.out.println("Ningun jugador se ha mojado");
                System.out.println("Continuando a la siguiente ronda...");
            }

            ronda++;
        } while (!terminar);

    }

    public static void cargarJugadores() {

        int id;
        String nombre;

        System.out.print("Ingrese la cantidad de jugadores: ");
        int cant = leer.nextInt();

        if (cant < 1 || cant > 6) {
            cant = 6;
        }

        System.out.println(">INGRESO DE JUGADORES<");

        for (int i = 0; i < cant; i++) {

            System.out.println("=================================");
            System.out.println("Jugador " + (i + 1));
            System.out.print("ID: ");
            id = leer.nextInt();
            System.out.print("Nombre: ");
            nombre = leer.next();

            jugadores.add(new Jugador(id, nombre));
        }
    }
}
