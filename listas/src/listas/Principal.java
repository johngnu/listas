package listas;

/**
 * INF - 131
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
    }
    
}
