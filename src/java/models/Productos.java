package models;

public class Productos {

    private String nombre;
    private String tipoIdentificacion;
    private String numeroIdentificacion;
    //private int productos;
    private int cantidadCamisas = 0;
    private int cantidadPantalones = 0;
    private int cantidadChaquetas = 0;

    public int getCantidadCamisas() {
        return cantidadCamisas;
    }

    public void setCantidadCamisas(int cantidadCamisas) {
        this.cantidadCamisas = cantidadCamisas;
    }

    public int getCantidadPantalones() {
        return cantidadPantalones;
    }

    public void setCantidadPantalones(int cantidadPantalones) {
        this.cantidadPantalones = cantidadPantalones;
    }

    public int getCantidadChaquetas() {
        return cantidadChaquetas;
    }

    public void setCantidadChaquetas(int cantidadChaquetas) {
        this.cantidadChaquetas = cantidadChaquetas;
    }

    public Productos() {

    }

    public Productos(String nombre, String correo, int pais, String numeroIdentificacion, String tipoIdentificacion) {
        this.nombre = nombre;
        this.tipoIdentificacion = correo;
        //this.productos = productos;
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

    /*
    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }
     */
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

}
