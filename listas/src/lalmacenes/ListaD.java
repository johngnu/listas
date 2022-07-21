package lalmacenes;

/**
 *
 * @author desktop
 */
public class ListaD {

    private NodoD p;

    public ListaD() {
        p = null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (p == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimeroLD(Producto x) {
        NodoD nuevo = new NodoD();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            p.setAnt(nuevo);
            setP(nuevo);
        }
    }

    public void adiFinalLD(Producto x) {
        NodoD nuevo = new NodoD();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            NodoD q = getP();
            while (q.getSig() != null) {
                q = q.getSig();
            }
            q.setSig(nuevo);
            nuevo.setAnt(q);
        }
    }

    public NodoD eliPrimeroLD() {
        NodoD q = getP();
        if (p.getSig() == null) {
            setP(null);
        } else {
            p = p.getSig();
            q.setSig(null);
            p.setAnt(null);
        }
        return q;
    }

    public NodoD eliFinalLD() {
        NodoD q = getP();
        if (p.getSig() == null) {
            setP(null);
        } else {
            while (q.getSig() != null) {
                q = q.getSig();
            }
            NodoD r = q.getAnt();
            r.setSig(null);
            q.setAnt(null);
        }
        return q;
    }

    public void mostrarLD() {
        NodoD q = getP();
        while (q != null) {
            q.getDato().mostrar();
            q = q.getSig();
        }
        System.out.println(" -- null");
    }

}
