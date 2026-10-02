package com.factoryMethod.facto12;

public class DocumentoGenerado {

    private final String id;
    private final String pais;
    private final String tipoContenido;
    private final String contenido;

    public DocumentoGenerado(String id, String pais, String tipoContenido, String contenido) {
        this.id = id;
        this.pais = pais;
        this.tipoContenido = tipoContenido;
        this.contenido = contenido;
    }


    public String getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }

    public String getContenido() {
        return contenido;
    }
}
