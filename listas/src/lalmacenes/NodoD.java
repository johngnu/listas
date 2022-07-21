package lalmacenes;

/**
 *
 * @author desktop
 */
public class NodoD {

    private Producto dato;
    private NodoD ant;
    private NodoD sig;

    public NodoD() {
        ant = sig = null;
    }

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    public NodoD getAnt() {
        return ant;
    }

    public void setAnt(NodoD ant) {
        this.ant = ant;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }

}
