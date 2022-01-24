package ENTIDADES;

public class Jugador {

    private String nombre;
    private int id;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(String nombre, int id, boolean mojado) {
        this.nombre = nombre;
        this.id = id;
        this.mojado = mojado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", id=" + id + ", mojado=" + mojado + '}';
    }

}
