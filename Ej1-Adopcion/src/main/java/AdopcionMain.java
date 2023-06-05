/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */

import entidad.Perro;
import entidad.Persona;
import entidad.TipoDeTamanio;

public class AdopcionMain {
    public static void main(String[] args) {

        Perro perro1 = new Perro("nina", "salchicha", 9, TipoDeTamanio.CHICO);
        Perro perro2 = new Perro("Luna", "mestiza", 7, TipoDeTamanio.GRANDE);

        Persona persona1 = new Persona("martin", "albanesi", 24);
        Persona persona2 = new Persona("gimena", "arganaraz", 23);

        persona1.setPerro(perro1);
        persona2.setPerro(perro2);

        System.out.println(persona1 + "\n" + persona2);
    }
}
