package listas;

/**
 *
 * @author desktop
 */
public class Nodo {

    private Mascota dato;
    private Nodo sig;

    public Nodo() {
        sig = null;
    }

    public Mascota getDato() {
        return dato;
    }

    public void setDato(Mascota dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
