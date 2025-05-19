public class Articulo {
     private final int id;
     private String nombre;  
     private double precio;
    // Constructor de la clase Articulo

    public Articulo(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    // Método para mostrar los detalles del artículo

    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
   
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Articulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio= $" + precio +
                '}';
    }   
}