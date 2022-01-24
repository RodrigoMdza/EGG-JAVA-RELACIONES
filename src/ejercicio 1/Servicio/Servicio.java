package Servicio;

import ENTIDAD.Perro;
import ENTIDAD.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    ArrayList<Perro> perros = new ArrayList();
    Persona persona = new Persona();
    Perro perro = new Perro();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        perro = new Perro();
        System.out.println("Ingrese el nombre");
        perro.setNombre(leer.next());
        System.out.println("Ingrese la raza");
        perro.setRaza(leer.next());
        System.out.println("Ingrese la edad");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño");
        perro.setTamaño(leer.next());
        perros.add(perro);
        System.out.println(perros);
        return new Perro(perro.getNombre(), perro.getRaza(), perro.getEdad(), perro.getTamaño());
    }

    public Persona crearPersona() {
        persona = new Persona();
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido");
        persona.setApellido(leer.next());
        System.out.println("Ingrese el DNI");
        persona.setDNI(leer.nextInt());
        return new Persona(persona.getNombre(), persona.getApellido(), persona.getDNI());
    }

    public void adoptarPerro(Persona x) {
        System.out.println("Ingrese el nombre del perro a adoptar");
        String nombreaux = leer.next();
        for (Perro aux : perros) {
            if (aux.getNombre().equals(nombreaux)) {
                persona.setPerrito(aux);
            }
        }
    }
}
