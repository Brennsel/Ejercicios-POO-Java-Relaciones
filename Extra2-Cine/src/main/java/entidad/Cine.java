package entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cine {

    private Sala sala;
    private Pelicula pelicula;
    private Double precio;

    public Cine(Pelicula pelicula, Double precio) {
        prepararSala();
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void prepararSala() {
        sala = new Sala();
        sala.cargarAsientos();
        sala.inicializarUbicaciones();
    }

    public void validarEspectador(List<Espectador> espectadores) {

        Iterator<Espectador> it = espectadores.iterator();
        Espectador aux;

        while (it.hasNext()) {
            aux = it.next();
            if (aux.getDineroDisponible() < precio || aux.getEdad() < pelicula.getEdadMinima()) {
                it.remove();
            }
        }
    }

    public void asignarEspectadoresASala(List<Espectador> espectadores) {

        System.out.println("Total de espectadores: " + espectadores.size());
        int disponibles = sala.getUbicacion().size()- espectadores.size();
        System.out.println("Asientos disponibles: " + disponibles);

        String[][] asientosAux = sala.getAsientos();
        int fila, columna, posEspectador = 0;
        String llave;
        Boolean ocupado;

        if(espectadores.size()< sala.getUbicacion().size()) {
            while (posEspectador < espectadores.size()) {

                do {
                    fila = (int) (Math.random() * 7 + 0);
                    columna = (int) (Math.random() * 5 + 0);
                    llave = asientosAux[fila][columna];
                    ocupado = false;

                    if (sala.getUbicacion().get(llave).getNombre().equals("")) {
                        sala.getUbicacion().put(llave, espectadores.get(posEspectador));
                        posEspectador++;
                    } else {
                        ocupado = true;
                    }
                } while (ocupado);
            }
        }
    }

    public void mostrarSala() {

        sala.mostrar();
    }

}


