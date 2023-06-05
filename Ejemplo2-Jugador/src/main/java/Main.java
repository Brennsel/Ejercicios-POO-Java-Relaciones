/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */

import entidad.Equipo;
import entidad.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("martin","albaness", 2,9);
        Jugador jugador2 = new Jugador("mar","alb", 5,8);
        Jugador jugador3 = new Jugador("maia","vazquez", 1,5);
        Jugador jugador4 = new Jugador("edid","lencina", 3,2);

        List<Jugador> jugadores = new ArrayList<>();

        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);

        Equipo equipo1 = new Equipo();

        equipo1.setJugadores(jugadores);

        System.out.println(equipo1.getJugadores().toString());
    }
}
