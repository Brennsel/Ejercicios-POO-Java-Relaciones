package entidad;

public class Dni {

    private char serie;
    private long numero;

    public Dni(char serie, long numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public long getNumero() {
        return numero;
    }
}
