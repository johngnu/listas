package listas;

/**
 *
 * @author desktop
 */
public class Mascota {

    private String nombre;
    private String raza;
    private int edad;
    private String sexo;
    private String tamanio;
    private String color;

    public Mascota() {
    }

    public Mascota(String nombre, String raza, int edad, String sexo, String tamanio, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.tamanio = tamanio;
        this.color = color;
    }

    public void mostrar() {
        System.out.println("nombre: " + nombre + " raza: " + raza + " edad: " + edad
                + " sexo: " + sexo + " tamanio: " + tamanio + " color: " + color);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
