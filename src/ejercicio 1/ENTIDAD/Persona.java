package ENTIDAD;

public class Persona {

    private String nombre;
    private String apellido;
    private Integer DNI;
    private Perro perrito;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public Persona(String nombre, String apellido, Integer DNI, Perro perrito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.perrito = perrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Perro getPerrito() {
        return perrito;
    }

    public void setPerrito(Perro perrito) {
        this.perrito = perrito;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", perrito=" + perrito + '}';
    }

}
