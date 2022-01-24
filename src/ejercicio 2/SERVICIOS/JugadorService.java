package SERVICIOS;

import ENTIDADES.Jugador;
import ENTIDADES.Revolver;

public class JugadorService {

    RevolverService rs = new RevolverService();

    public void disparo(Jugador j, Revolver r) {
        if (j.isMojado()) {
            j.setMojado(rs.mojar(r));
        }
    }
}
