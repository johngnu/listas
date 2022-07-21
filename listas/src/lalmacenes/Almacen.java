package lalmacenes;

/**
 *
 * @author desktop
 */
public class Almacen {

    private int codAlmacen;
    private String nombreResponsable;
    private String direccion;
    private ListaD listaProductos;

    public Almacen() {
    }

    public Almacen(int codAlmacen, String nombreResponsable, String direccion, ListaD listaProductos) {
        this.codAlmacen = codAlmacen;
        this.nombreResponsable = nombreResponsable;
        this.direccion = direccion;
        this.listaProductos = listaProductos;
    }

    public int getCodAlmacen() {
        return codAlmacen;
    }

    public void setCodAlmacen(int codAlmacen) {
        this.codAlmacen = codAlmacen;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ListaD getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ListaD listaProductos) {
        this.listaProductos = listaProductos;
    }
     
}
