package entidad;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private List<Jugador> jugadores;
    private Revolver revolver;

    public void llenarJuego(List<Jugador> jugadores, Revolver r) {

        this.jugadores = jugadores;
        this.revolver = r;
    }

    public Jugador ronda() {

        for (Jugador jugadorActual : jugadores) {

            System.out.print("Turno de " + jugadorActual.getNombre() + ": ");

            if (jugadorActual.disparo(revolver)) {
                return jugadorActual;
            }
            System.out.println("Se ha salvado");
        }
        return null;
    }

}
