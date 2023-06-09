import entidad.Cine;
import entidad.Espectador;
import entidad.Pelicula;
import entidad.Sala;

import java.util.ArrayList;
import java.util.List;

public class CineMain {

    public static void main(String[] args) {

        List<Espectador> espectadores = new ArrayList<>();
        crearEspectadores(espectadores);

        Pelicula pelicula = new Pelicula("Rapidos y furiosos", 128, 18, "David");

        Cine cine = new Cine(pelicula, 1000.0);

        cine.validarEspectador(espectadores);
        cine.asignarEspectadoresASala(espectadores);
        System.out.println(">>>>>>>>>>>SALA DEL CINE<<<<<<<<<<<<");
        cine.mostrarSala();
    }

    public static void crearEspectadores(List<Espectador> espectadores){

        espectadores.add(new Espectador("martin", 24,2000.0));
        espectadores.add(new Espectador("brenda", 26, 1000.0));
        espectadores.add(new Espectador("maia", 7, 3000.0));
        espectadores.add(new Espectador("gimena", 21, 5000.0));
        espectadores.add(new Espectador("edid", 40, 1200.0));
        espectadores.add(new Espectador("gonzalo", 17, 900.0));
        espectadores.add(new Espectador("agustin", 18, 800.0));
        espectadores.add(new Espectador("monica", 56, 1400.0));
        espectadores.add(new Espectador("adrian", 47, 1300.0));
        espectadores.add(new Espectador("nina", 19, 1250.0));
        espectadores.add(new Espectador("luna", 12, 1300.0));
        espectadores.add(new Espectador("mora", 19, 2000.0));
        espectadores.add(new Espectador("raul", 55, 1400.0));
    }
}



