/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */

package entidad;

public class Jugador {

    private String nombre;
    private String apellido;
    private int posicion;
    private int numero;

    public Jugador(String nombre, String apellido, int posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion=" + posicion +
                ", numero=" + numero +
                '}';
    }
}
