/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main
 */

package main;

import entidad.Dni;
import entidad.Persona;

public class MainClass {
    public static void main(String[] args) {

        Dni dni1 = new Dni('a', 38422);

        Persona persona1 = new Persona("Brenda Selene", "Arganaraz", dni1);

        System.out.println(persona1.getDni().getNumero());
        System.out.println(persona1.getDni().getSerie());

    }
}
