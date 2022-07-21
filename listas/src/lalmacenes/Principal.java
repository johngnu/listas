package lalmacenes;

/**
 *
 * @author desktop
 */
public class Principal {

    public static void main(String[] args) {
        Producto p1 = new Producto("leche", "lácteos", 10, 5);
        Producto p2 = new Producto("vino", "bebida", 30, 5);
        Producto p3 = new Producto("pepsi", "bebida", 10, 15);
        ListaD ld1 = new ListaD();
        ld1.adiFinalLD(p1);
        ld1.adiFinalLD(p2);
        ld1.adiFinalLD(p3);

        Producto p4 = new Producto("yogurt", "lácteos", 13, 10);
        Producto p5 = new Producto("singani", "bebida", 80, 10);
        Producto p6 = new Producto("sprite", "bebida", 10, 5);
        ListaD ld2 = new ListaD();
        ld2.adiFinalLD(p4);
        ld2.adiFinalLD(p5);
        ld2.adiFinalLD(p6);

        Producto p7 = new Producto("queso", "lácteos", 40, 8);
        Producto p8 = new Producto("pan", "reposteria", 1, 50);
        Producto p9 = new Producto("fanta", "bebida", 10, 25);
        ListaD ld3 = new ListaD();
        ld3.adiFinalLD(p7);
        ld3.adiFinalLD(p8);
        ld3.adiFinalLD(p9);

        //ld1.mostrarLD();
        //ld2.mostrarLD();
        //ld3.mostrarLD();
        Almacen a1 = new Almacen(1, "luis", "Loaysa 10", ld1);
        Almacen a2 = new Almacen(2, "pedro", "Arce 22", ld2);
        Almacen a3 = new Almacen(3, "luz", "Camacho 11", ld3);

        ListaS lsa = new ListaS();
        lsa.adiFinalLista(a1);
        lsa.adiFinalLista(a2);
        lsa.adiFinalLista(a3);

        lsa.mostrarListaSimple();

        System.out.println("\n A) ___________________");
        mostrarCategoria(lsa, "bebida");
        
        System.out.println("\n B) ___________________");
        mostrarPrecioAlto(lsa);
    }

    public static void mostrarCategoria(ListaS lsa, String xc) {
        Nodo q = lsa.getP();
        Almacen x;
        while (q != null) {
            x = q.getDato();
            System.out.println("\n codigo: " + x.getCodAlmacen() + " responsable: " + x.getNombreResponsable()
                    + " direccion: " + x.getDireccion());
            NodoD nq = x.getListaProductos().getP();
            while (nq != null) {
                if (nq.getDato().getCategoria().equals(xc)) {
                    nq.getDato().mostrar();
                }
                nq = nq.getSig();

            }

            q = q.getSig();
        }
    }

    public static void mostrarPrecioAlto(ListaS lsa) {
        Nodo q = lsa.getP();
        Almacen x;
        while (q != null) {
            x = q.getDato();
            System.out.println("\n codigo: " + x.getCodAlmacen() + " responsable: " + x.getNombreResponsable()
                    + " direccion: " + x.getDireccion());
            NodoD nq = x.getListaProductos().getP();
            Producto paux = new Producto();
            paux.setPrecio(0);
            while (nq != null) {
                if (nq.getDato().getPrecio() > paux.getPrecio()) {
                    paux = nq.getDato();
                }
                nq = nq.getSig();
            }
            System.out.println("El producto de precio mas alto es: ");
            paux.mostrar();
            q = q.getSig();
        }
    }
}
