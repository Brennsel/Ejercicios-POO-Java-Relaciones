package entidad;

public class Revolver {

    private int posActual;
    private int posAgua;


    public void llenarRevolver() {

        posActual = (int) (Math.random() * 6 + 1);
        posAgua = (int) (Math.random() * 6 + 1);
    }

    public boolean mojar() {

        if (posAgua == posActual) {
            return true;
        }
        return false;
    }

    public void siguienteChorro() {

        if (posActual != 6) {
            posActual++;
        } else {
            posActual = 1;
        }
    }

    @Override
    public String toString() {
        return "INFORMACION DEL REVOLVER---> posActual: " + posActual + " , posAgua: " + posAgua;
    }
}