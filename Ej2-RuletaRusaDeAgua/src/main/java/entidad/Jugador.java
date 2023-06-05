package entidad;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
    }

    public boolean disparo(Revolver r) {

        if (r.mojar()) {
            System.out.println("BOOM");
            this.mojado = true;
            return true;
        } else {
            r.siguienteChorro();
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }
}
