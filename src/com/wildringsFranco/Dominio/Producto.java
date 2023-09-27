package com.wildringsFranco.Dominio;

public class Producto {
    private int codigoWF;
    private String nombreWF;
    private int cantidadWF;
    private int precioWF;
    private String tipoWF;

    public Producto(int codigoWF, String nombreWF, int cantidadWF, int precioWF, String tipoWF) {
        this.codigoWF = codigoWF;
        this.nombreWF = nombreWF;
        this.cantidadWF = cantidadWF;
        this.precioWF = precioWF;
        this.tipoWF = tipoWF;
    }

    public int getCodigoWF() {
        return codigoWF;
    }

    public String getNombreWF() {
        return nombreWF;
    }

    public int getCantidadWF() {
        return cantidadWF;
    }

    public int getPrecioWF() {
        return precioWF;
    }

    public String getTipoWF() {
        return tipoWF;
    }

    public void setCantidadWF(int cantidadWF) {
        this.cantidadWF = cantidadWF;
    }

    public void setPrecioWF(int precioWF) {
        this.precioWF = precioWF;
    }
}