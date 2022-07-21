package lalmacenes;

/**
 *
 * @author desktop
 */
public class Nodo {

    private Almacen dato;
    private Nodo sig;

    public Nodo() {
        sig = null;
    }

    public Almacen getDato() {
        return dato;
    }

    public void setDato(Almacen dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
