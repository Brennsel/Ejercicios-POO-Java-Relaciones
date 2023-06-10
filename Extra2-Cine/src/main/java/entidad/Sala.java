package entidad;

import java.util.*;

public class Sala {

    private String[][] asientos;
    private Map<String, Espectador> ubicacion;

    public Sala() {
        ubicacion = new HashMap<>();
        asientos = new String[8][6];
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public Map<String, Espectador> getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Map<String, Espectador> ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void cargarAsientos() {

        int fila;
        String columna = "", aux = "", ubicacion = "";

        for (int i = 0; i < 8; i++) {
            fila = -(i - 8);

            for (int j = 0; j < 6; j++) {

                switch (j) {
                    case 0:
                        columna = "A";
                        break;
                    case 1:
                        columna = "B";
                        break;
                    case 2:
                        columna = "C";
                        break;
                    case 3:
                        columna = "D";
                        break;
                    case 4:
                        columna = "E";
                        break;
                    case 5:
                        columna = "F";
                        break;
                    default:
                        break;
                }

                ubicacion = aux.concat(String.valueOf(fila));
                asientos[i][j] = ubicacion.concat(columna);
            }
        }
    }

    public void inicializarUbicaciones() {

        String asiento;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {

                asiento = asientos[i][j];
                ubicacion.put(asiento, new Espectador("", 0, 0.0));
            }
        }
    }

    public void mostrar() {

        String llave;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {

                llave = asientos[i][j];
                System.out.print(llave + " ");
                if (ubicacion.get(llave).getNombre().equals("")) {
                    if(j==5){
                        System.out.print("  ");
                    }else{
                        System.out.print("  | ");
                    }

                } else {
                    if(j==5){
                        System.out.print("X ");
                    }else{
                        System.out.print("X | ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
