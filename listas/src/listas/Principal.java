package listas;

/**
 * INF - 131
 *
 * @author helen carolina castillo mamani
 */
public class Principal {

    public static void main(String[] args) {
        // Datos
        Mascota m1 = new Mascota("princesa", "cocker", 2, "hembra", "mediano", "cafe");
        Mascota m2 = new Mascota("toto", "beangle", 4, "macho", "mediano", "blanco");
        Mascota m3 = new Mascota("perla", "labrador", 5, "hembra", "grande", "canela");
        Mascota m4 = new Mascota("chucho", "terrier", 7, "macho", "grande", "negro");
        Mascota m5 = new Mascota("negro", "coker", 3, "macho", "mediano", "negro");
        Mascota m6 = new Mascota("niebla", "beagle", 2, "hembra", "mediano", "cafe");

        ListaSC lsc = new ListaSC();
        lsc.adiFinalLSC(m1);
        lsc.adiFinalLSC(m2);
        lsc.adiFinalLSC(m3);
        lsc.adiFinalLSC(m4);
        lsc.adiFinalLSC(m5);
        lsc.adiFinalLSC(m6);

        lsc.mostrarLSC2();

        System.out.println("\n A) ___________________");
        ordenar(lsc);
        lsc.mostrarLSC2();
        
        
        System.out.println("\n B) ___________________");
        ListaSC lmachos = dividir(lsc, "macho");
        ListaSC lhembras = dividir(lsc, "hembra");

        System.out.println("Lista machos: ");
        lmachos.mostrarLSC2();

        System.out.println("Lista hebras: ");
        lhembras.mostrarLSC2();

        System.out.println("\n C) ___________________");
        promedioEdad(lhembras);
    }

    public static ListaSC dividir(ListaSC lsc, String sexo) {
        ListaSC ln = new ListaSC();
        Nodo q = lsc.getP();
        for (int i = 0; i < lsc.nroNodos(); i++) {
            if (q.getDato().getSexo().equals(sexo)) {
                ln.adiFinalLSC(q.getDato());
            }
            q = q.getSig();
        }
        return ln;
    }

    public static void promedioEdad(ListaSC lsc) {
        Nodo q = lsc.getP();
        int sum = 0;
        for (int i = 0; i < lsc.nroNodos(); i++) {
            sum = sum + q.getDato().getEdad();
            q = q.getSig();
        }
        System.out.println("El promedio de edad es: " + (sum / lsc.nroNodos()));
    }

    public static void ordenar(ListaSC lsc) {
        Nodo p = lsc.getP();
        int cn = lsc.nroNodos();
        for (int i = 0; i < cn; i++) {
            Nodo q = lsc.getP();
            Nodo r = lsc.getP();
            for (int j = 0; j < cn; j++) {
                q = r.getSig();
                if (r.getDato().getRaza().compareTo(q.getDato().getRaza()) > 0) {
                    Mascota aux = q.getDato();
                    r.setDato(r.getDato());
                    q.setDato(aux);
                }
                r = r.getSig();
            }
        }
    }
}
