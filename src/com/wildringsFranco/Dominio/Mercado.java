package com.wildringsFranco.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public byte capacidadWF;
    private String supermercadoML;
    private List<Producto> productosWF ;


    public Mercado(byte capacidadWF) {
        this.capacidadWF = capacidadWF;
        this.productosWF = new ArrayList<>();
    }

    public boolean agregarProducto(Producto p) {
        for (Producto productoExistente : productosWF) {
            if (productoExistente.getCodigoWF() == p.getCodigoWF()) {
                return false;
            }
        }
        if (productosWF.size() >= capacidadWF) {
            return false;
        }
        productosWF.add(p);
        return true;
    }


        public boolean retirar (String nombreWF){
            for (int i = 0; i < productosWF.size();i++) {
                Producto producto = productosWF.get(i);
                if (producto.getNombreWF().equals(nombreWF)){
                    productosWF.remove(i);
                    return true;
                }
            }
            return false;
        }
    public Producto buscarProductoNombre(String nombreWF){
        for (Producto p: productosWF){
            if (p.getNombreWF().equals(nombreWF)){
                return p;
            }
        }
        return null;
    }


    public Producto buscarCodigoProducto(int codigoWF) {
        for (Producto p : productosWF) {
            if (p.getCodigoWF() == codigoWF) {
                return p;
            }
        }
        return null;
    }
    public List<TipoProducto> buscarTipoProducto(String tipoWF) {
        List<TipoProducto> productosPorTipo = new ArrayList<>();

        for (Producto p : productosWF) {
            if (p.getTipoWF().equals(tipoWF)) {
                return productosPorTipo;
            }
        }
        return null;
    }

    public int calcularTotal() {
        int total = 0;
        for (Producto producto : productosWF) {
            total += producto.getPrecioWF();
        }
        return total;
    }

    public byte getCapacidadWF() {
        return capacidadWF;
    }

    public String getSupermercadoML() {
        return supermercadoML;
    }

    public List<Producto> getProductosWF() {
        return productosWF;
    }
}