package com.wildringsFranco.App;

import com.wildringsFranco.Dominio.Mercado;
import com.wildringsFranco.Dominio.Producto;
import com.wildringsFranco.Dominio.TipoProducto;

import static com.wildringsFranco.Dominio.TipoProducto.*;

public class App {
    public static void main(String[] args) {
        Mercado Cianuro = new Mercado((byte) 100);

        Producto producto1 = new Producto(1, "Guanabana", 5, 2000, "fruta");
        Producto producto2 = new Producto(2, "Yogurt", 8, 2500, "lacteo");
        Producto producto3 = new Producto(2, "Leche descremada", 7, 2000, "lacteo");
        Producto producto4 = new Producto(3, "Apio", 4, 4000, "verdura");

        boolean resultado1 = Cianuro.agregarProducto(producto1);
        System.out.println("Producto 1 agregado : " + resultado1);
        boolean resultado2 = Cianuro.agregarProducto(producto2);
        System.out.println("Producto 2 agregado : " + resultado2);
        boolean resultado3 = Cianuro.agregarProducto(producto3);
        System.out.println("Producto 2 agregado : " + resultado3);
        boolean resultado4 = Cianuro.agregarProducto(producto4);
        System.out.println("Producto 3 agregado : " + resultado4);

        Producto encontradoM1 = Cianuro.buscarProductoNombre("Guanabana");
        System.out.println("Se encontro por su nombre un producto: " + (encontradoM1 != null ? encontradoM1.getNombreWF(): "No encontrado"));
        Producto encontradoM2 = Cianuro.buscarProductoNombre("Yogurt");
        System.out.println("Se encontro por su nombre un producto: " + (encontradoM2 != null ? encontradoM2.getNombreWF(): "No encontrado"));
        Producto encontradoM3 = Cianuro.buscarProductoNombre("Leche descremada");
        System.out.println("Se encontro por su nombre un producto: " + (encontradoM3 != null ? encontradoM3.getNombreWF(): "No encontrado"));
        Producto encontradoM4 = Cianuro.buscarProductoNombre("Apio");
        System.out.println("Se encontro por su nombre un producto: " + (encontradoM4 != null ? encontradoM4.getNombreWF(): "No encontrado"));


        Producto encontradoC1 = Cianuro.buscarCodigoProducto(1);
        System.out.println("Se encontro por su codigo un producto: " + (encontradoC1 != null ? encontradoC1.getNombreWF(): "No encontrado"));
        Producto encontradoC2 = Cianuro.buscarCodigoProducto(2);
        System.out.println("Se encontro por su codigo un producto: " + (encontradoC2 != null ? encontradoC2.getNombreWF(): "No encontrado"));
        Producto encontradoC3 = Cianuro.buscarCodigoProducto(3);
        System.out.println("Se encontro por su codigo un producto: " + (encontradoC3 != null ? encontradoC3.getNombreWF(): "No encontrado"));
        Producto encontradoC4 = Cianuro.buscarCodigoProducto(3);
        System.out.println("Se encontro por su codigo un producto: " + (encontradoC4 != null ? encontradoC4.getNombreWF(): "No encontrado"));

        double total = Cianuro.calcularTotal();
        System.out.println("Total del inventario: " + total);
        System.out.println("------------------------------------------");

        boolean eliminarP = Cianuro.retirar("Leche descremada");
        System.out.println("El producto se a eliminado: " + eliminarP);
    }

}