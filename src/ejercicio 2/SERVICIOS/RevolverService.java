package SERVICIOS;

import ENTIDADES.Revolver;

public class RevolverService {

    Revolver r = new Revolver();

    public void llenarRevolver(Revolver r) {

        r.setPosicionActual((int) Math.random() * 6);
        r.setPosicionActual((int) Math.random() * 6);
    }

    public boolean mojar(Revolver r) {
        if (r.getPosicionActual() == r.getPosicionAgua()) {
            return true;
        } else {
            System.out.println("NO SE HA MOJADO");
        }
        return false;
    }

    public void siguienteChorro(Revolver r) {
        r.setPosicionActual(r.getPosicionActual() + 1);
    }
}
