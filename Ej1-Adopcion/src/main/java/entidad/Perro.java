package entidad;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private TipoDeTamanio tamanio;

    public Perro(String nombre, String raza, int edad, TipoDeTamanio tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamanio=" + tamanio +
                '}';
    }
}
