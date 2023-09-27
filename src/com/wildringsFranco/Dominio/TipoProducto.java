package com.wildringsFranco.Dominio;

public class TipoProducto {


    public String CarneWF;
    public String VERDURAWF;
    public String LACTEOWF;
    public String FRUTAWF;
    public String PANWF;
    public String GASEOSAWF;
    public String CAFEWF;
    public String TintoWF;

    public TipoProducto(String carneWF, String VERDURAWF, String LACTEOWF, String FRUTAWF, String PANWF, String GASEOSAWF, String CAFEWF, String tintoWF) {
        CarneWF = carneWF;
        this.VERDURAWF = VERDURAWF;
        this.LACTEOWF = LACTEOWF;
        this.FRUTAWF = FRUTAWF;
        this.PANWF = PANWF;
        this.GASEOSAWF = GASEOSAWF;
        this.CAFEWF = CAFEWF;
        TintoWF = tintoWF;
    }
    public String getCarneWF() {
        return CarneWF;
    }

    public String getVERDURAWF() {
        return VERDURAWF;
    }

    public String getLACTEOWF() {
        return LACTEOWF;
    }

    public String getFRUTAWF() {
        return FRUTAWF;
    }

    public String getPANWF() {
        return PANWF;
    }
}
