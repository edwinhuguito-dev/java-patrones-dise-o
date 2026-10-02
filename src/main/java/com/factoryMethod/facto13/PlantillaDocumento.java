package com.factoryMethod.facto13;

public class PlantillaDocumento {
    private final String idDocumento;
    private final String tipoDocumento;
    private final String contenido;

    public PlantillaDocumento(String idDocumento, String tipoDocumento, String contenido) {
        this.idDocumento = idDocumento;
        this.tipoDocumento = tipoDocumento;
        this.contenido = contenido;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getContenido() {
        return contenido;
    }
}
