package model;

public class Producto {

    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public Producto(String nombre, double precio) {
       setNombre(nombre);
       setPrecio(precio);

    }

    public Producto (){}

    @Override
    public String toString() {
        return
                "nombre = " + nombre + '\n' +
                "precio = " + precio + "\n";
    }
}

