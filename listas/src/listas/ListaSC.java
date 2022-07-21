package listas;

/**
 *
 * @author desktop
 */
public class ListaSC {

    Nodo p;

    public ListaSC() {
        p = null;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimeroLSC(Mascota x) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            Nodo q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            nuevo.setSig(getP());
            q.setSig(nuevo);
            setP(nuevo);
        }
    }

    public void adiFinalLSC(Mascota x) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            Nodo q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            q.setSig(nuevo);
            nuevo.setSig(getP());
        }
    }

    public Nodo eliPrimeroLSC() {
        Nodo aux = getP();
        Nodo q = getP();
        if (q.getSig() == getP()) {
            setP(null);
        } else {
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            setP(aux.getSig());
            q.setSig(getP());
            aux.setSig(null);
        }
        return aux;
    }

    public Nodo eliFinalLSC() {
        Nodo aux = getP();
        Nodo q = getP();
        if (q.getSig() == getP()) {
            setP(null);
        } else {
            while (aux.getSig() != getP()) {
                q = aux;
                aux = aux.getSig();
            }
            q.setSig(getP());
            aux.setSig(null);
        }
        return aux;
    }

    public void mostrarLSC() {
        if (esVacia()) {
            System.out.println(" lista vacia");
        } else {
            Nodo q = getP();
            while (q.getSig() != getP()) {
                q.getDato().mostrar();
                q = q.getSig();
            }
            System.out.println(" " + q.getDato());
        }
    }

    public int nroNodos() {
        Nodo q = getP();
        int c = 0;
        if (!esVacia()) {
            while (q.getSig() != getP()) {
                c = c + 1;
                q = q.getSig();
            }
            c = c + 1;
        }
        return c;
    }

    public void mostrarLSC2() {
        Nodo q = getP();
        for (int i = 0; i < nroNodos(); i++) {
            q.getDato().mostrar();
            q = q.getSig();
        }
    }
}
