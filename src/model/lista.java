package model;

import java.util.ArrayList;
import java.util.Scanner;

public class lista {

    int opcion;

    public static int showMenu() {
        ArrayList<Integer> menuOptions = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int option;


        System.out.println("*******************************");
        System.out.println("*1 -    Añadir Producto       *");
        System.out.println("*2 -  Eliminar Producto       *");
        System.out.println("*3 - Mostrar lista articulos  *");
        System.out.println("*4 - Consultar importe total  *");
        System.out.println("*0 -      Pagar               *");
        System.out.println("*******************************");
        System.out.printf("option :\n");

        return input.nextInt();
    }

    public static void añadirProducto(ArrayList<Producto> listaCompra) {
        int opcion;

        do {
            Scanner input = new Scanner(System.in);
            Producto nuevoProducto = new Producto();
            String nombreNuevoProducto;
            Double precioNuevoProducto;


            System.out.printf("Introduzca el nombre del nuevo producto\n");
            nombreNuevoProducto = input.nextLine();
            System.out.printf("Introduzca el precio del nuevo producto\n");
            precioNuevoProducto = input.nextDouble();

            nuevoProducto.setNombre(nombreNuevoProducto);
            nuevoProducto.setPrecio(precioNuevoProducto);

            System.out.printf("El producto " + nombreNuevoProducto + " con un precio de " + precioNuevoProducto + "$\n");
            System.out.printf("Pulse 1 para confirmar\n");
            opcion = input.nextInt();
            if (opcion == 1) {
                listaCompra.add(nuevoProducto);
                System.out.println("Producto añadido a la lista\n");
            }
        } while (opcion != 1);

    }

    public static void eliminarProducto(ArrayList<Producto> listaCompra) {
        int opcion;
        int aux;
        int posicionParaBorrar;
        do {
            int posicion = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Esta es su lista actual");

            for (Producto prodc : listaCompra) {
                System.out.println(posicion + " " + prodc.getNombre() + " " + prodc.getPrecio());
                posicion++;
            }

            System.out.println("Indique el producto que desea eliminar");
            opcion = input.nextInt();
            System.out.println("Va a eliminarse el producto:\n " + listaCompra.get(opcion));
            System.out.printf("Pulse 1 para confirmar\n");
            aux = input.nextInt();
            if (aux == 1) {
                listaCompra.remove(opcion);
                System.out.println("Producto borrado de la lista\n");
            }
        } while (aux != 1);

    }

    public static void mostrarProducto(ArrayList<Producto> listaCompra) {
        int posicion = 0;
        for (Producto prodc : listaCompra) {
            System.out.println(posicion + " " + prodc.getNombre() + " " + prodc.getPrecio());
            posicion++;
        }
        System.out.println();
    }

    public static double importeTotal(ArrayList<Producto> listaCompra) {
        double costeTotal = 0;
        for (Producto prdc : listaCompra) {
            costeTotal += prdc.getPrecio();
        }
        return costeTotal;
    }

    public static void pagar(ArrayList<Producto> listaCompra) {

        System.out.println("El total de su compra ha sido: " + importeTotal(listaCompra) + "$");

        System.out.println("Los articulos han sido");
        mostrarProducto(listaCompra);
    }
}

