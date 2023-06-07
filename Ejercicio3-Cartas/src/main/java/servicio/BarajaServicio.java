package servicio;

import entidad.Baraja;
import entidad.Carta;

import java.util.*;

import static java.util.Collections.shuffle;

public class BarajaServicio {

    Set<Carta> baraja = new HashSet<>();
    ArrayList<Carta> barajaLista;
    Baraja mazo = new Baraja();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearBaraja() {

        String palo = "";

        for (int j = 1; j <= 4; j++) {

            for (int i = 1; i <= 12; i++) {

                if (i != 8 && i != 9) {

                    switch (j) {
                        case 1:
                            palo = "ORO";
                            break;
                        case 2:
                            palo = "BASTOS";
                            break;
                        case 3:
                            palo = "ESPADA";
                            break;
                        case 4:
                            palo = "COPAS";
                            break;
                        default:
                            break;
                    }
                    baraja.add(new Carta(i, palo));
                }
            }
        }

        barajaLista = new ArrayList<>(baraja);
        mazo.setBaraja(baraja);
        System.out.println(baraja.size());
    }

    public void barajar() {

        shuffle(barajaLista);

        mazo.setBaraja(new HashSet<>(barajaLista));
    }

    public Carta siguienteCarta() {

        Carta carta;

        if (mazo.getPosActual() < barajaLista.size()) {
            carta = barajaLista.get(mazo.getPosActual());
            mazo.setPosActual(mazo.getPosActual() + 1);
            return carta;
        }
        return null;
    }

    public int cartasDisponibles() {

        return barajaLista.size() - (mazo.getPosActual());
    }

    public List<Carta> darCartas() {

        int cant;
        int disponibles = cartasDisponibles();
        List<Carta> repartidas = new ArrayList<>();

        System.out.print("Ingrese la cantidad de cartas que desea repartir: ");
        cant = leer.nextInt();

        if (cant <= disponibles) {

            for (int i = 0; i < cant; i++) {
                repartidas.add(barajaLista.get(mazo.getPosActual()));
                mazo.setPosActual(mazo.getPosActual() + 1);
            }
            return repartidas;
        }

        return null;
    }

    public void cartasMonton() {

        int cantRepartidas;

        cantRepartidas = mazo.getPosActual() + 1;

        if(cantRepartidas!=0) {
            System.out.println("Cartas que ya han sido repartidas:");

            for (int i = 0; i < cantRepartidas; i++) {

                System.out.println(barajaLista.get(i));
            }
        } else{
            System.out.println("No se ha repartido ninguna carta aun");
        }
    }

    public void mostrarBaraja(){

        System.out.println("Cartas disponibles:");

        for (int i = mazo.getPosActual(); i < barajaLista.size(); i++) {

                System.out.println(barajaLista.get(i));
        }
    }

    public void mostrarMazo(){
        for (Carta actual : barajaLista){
            System.out.println(actual);
        }
    }
}
