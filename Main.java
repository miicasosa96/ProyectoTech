
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Articulo> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do { 

        System.out.println("------ Menú de Artículos -------");
        System.out.println("1. Crear Articulo");   
        System.out.println("2. Listar Articulos");          
        System.out.println("3. Modificar Articulo");
        System.out.println("4. Eliminar Articulo");     
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        
        switch (opcion) {
            case 1 -> crearArticulo();
            case 2 -> listarArticulos();
            case 3 -> modificarArticulo();
            case 4 -> eliminarArticulo();
            case 5 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción inválida. Intente de nuevo.");
        }
        } while (opcion != 5);      



        }
        
    public static void crearArticulo() {
      System.out.print("ID: ");
      int id = sc.nextInt(); sc.nextLine();
       boolean idExistente = false;
        for (Articulo a : lista) {
            if (a.getId() == id) {
                idExistente = true;
                break;
            }
        }
        if (idExistente) {
            System.out.println("ID ya existe. Intente con otro.");
        } else {
            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.print("Precio: ");
            double precio = sc.nextDouble(); sc.nextLine();
            Articulo articulo = new Articulo(id, nombre, precio);
            lista.add(articulo);
            System.out.println("Artículo creado con éxito. ✅");
        }
        }

    public static void listarArticulos() {
        if (lista.isEmpty()) {
            System.out.println("No hay artículos cargados.");
        } else {
            for (Articulo a : lista) {
                a.mostrar();
            }
        }

        
    }

    public static void modificarArticulo() {
        System.out.print("Ingrese ID del artículo a modificar: ");
        int id = sc.nextInt(); sc.nextLine();
        for (Articulo a : lista) {
            if (a.getId() == id) {
                System.out.print("Nuevo nombre: ");
                String nuevoNombre = sc.nextLine();
                System.out.print("Nuevo precio: ");
                double nuevoPrecio = sc.nextDouble(); sc.nextLine();
                a.setNombre(nuevoNombre);
                a.setPrecio(nuevoPrecio);

                System.out.println("Artículo modificado con éxito.");
                break;
            }
        }
        System.out.println("Artículo no encontrado.");

    }
    public static void devolverNombreArticulo() {
        System.out.print("Ingrese ID del artículo: ");
        int id = sc.nextInt(); sc.nextLine();
        for (Articulo a : lista) {
            if (a.getId() == id) {
                System.out.println("Nombre del artículo: " + a.getNombre());
                return;
            }
        }
        System.out.println("Artículo no encontrado.");
    }
    
    
    public static void eliminarArticulo() {
        System.out.print("ID del artículo a eliminar: ");
        int id = sc.nextInt(); sc.nextLine();
         lista.removeIf(a -> a.getId() == id);
        System.err.println("Artículo eliminado con éxito.");

            }
        }
        

