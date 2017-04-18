package org.jose.controller;

import model.Producto;
import model.lista;
import java.util.ArrayList;

public class Main {
    int opcion;

    public static void main(String[] args) {
        int opcion;
        Producto cocaCola = new Producto("refresco", 1);
        Producto cafeHacendado = new Producto("cafe", 2);
        Producto pollo = new Producto("KG/Pollo", 3.5);
        Producto arroz = new Producto("SoS", 2);
        ArrayList<Producto> listaCompra = new ArrayList<>();

        listaCompra.add(cocaCola);
        listaCompra.add(cafeHacendado);
        listaCompra.add(pollo);
        listaCompra.add(arroz);

        while ((opcion = lista.showMenu())  != 0) {
            if (opcion == 1) {
                lista.añadirProducto(listaCompra);
            }
            if (opcion == 2) {
                lista.eliminarProducto(listaCompra);
            }
            if (opcion == 3) {
                lista.mostrarProducto(listaCompra);
            }
            if (opcion == 4) {
                System.out.println(lista.importeTotal(listaCompra));
            }
        }
        lista.pagar(listaCompra);
    }

}





