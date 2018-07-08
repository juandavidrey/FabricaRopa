package models;

public class Productos {

    //private int id;
    private String nombre;
    private String tipoIdentificacion;
    private int numeroIdentificacion;
    private int productos;

    public Productos() {

    }

    public Productos(String nombre, String correo, int pais, int numeroIdentificacion, String tipoIdentificacion) {
        this.nombre = nombre;
        this.tipoIdentificacion = correo;
        this.productos = pais;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

}
