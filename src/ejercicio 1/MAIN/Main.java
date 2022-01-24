/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona
 */
package MAIN;

import ENTIDAD.Perro;
import ENTIDAD.Persona;
import Servicio.Servicio;


public class Main {

   
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        Perro perro1 = servicio.crearPerro();
        Perro perro2 = servicio.crearPerro();
        Persona persona1 = servicio.crearPersona();
        Persona persona2 = servicio.crearPersona();
    /* EJERCICIO 1 COMUN
        persona1.setPerro(perro2);
        persona2.setPerro(perro1);
        System.out.println("CADA PERSONA CON CADA PERRO ADOPTADO HA QUEDADO");
        System.out.println(persona1);
        System.out.println(persona2);
    */
        System.out.println("EJERCICIO ! EXTRA");
        servicio.adoptarPerro(persona1);
        servicio.adoptarPerro(persona2);
        System.out.println(persona1);
        System.out.println(persona2);
    }

}
