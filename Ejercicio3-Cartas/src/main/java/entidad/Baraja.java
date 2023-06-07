package entidad;

import java.util.HashSet;
import java.util.Set;

public class Baraja {

    private Set<Carta> baraja;
    private int posActual;

    public Baraja() {
        this.baraja = new HashSet<>();
        posActual = 0;
    }

    public Set<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(Set<Carta> baraja) {
        this.baraja = baraja;
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

}
