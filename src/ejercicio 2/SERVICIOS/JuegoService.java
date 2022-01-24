package SERVICIOS;

import ENTIDADES.Juego;
import ENTIDADES.Jugador;
import ENTIDADES.Revolver;
import java.util.ArrayList;

public class JuegoService {

    JugadorService js = new JugadorService();
    RevolverService rs = new RevolverService();

    public Juego llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        return new Juego(jugadores, r);
    }

    public void ronda(Jugador jugador, Revolver r) {
        System.out.println("TURNO DE " + jugador.getNombre());
        js.disparo(jugador, r);
        rs.siguienteChorro(r);
    }

    public void jugar(Juego juego) {
        for (Jugador jugador : juego.getJugadores()) {
            ronda(jugador, juego.getRevolver());
            if (jugador.isMojado()) {
                System.out.println("EL " + jugador.getNombre() + "PERDIO");
            }
        }
    }
}
