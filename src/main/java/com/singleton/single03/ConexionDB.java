package com.singleton.single03;

public class ConexionDB {

    private static ConexionDB instancia;
    private String servidor;
    private String baseDatos;
    private String usuario;


    private ConexionDB(){

    }


    public static ConexionDB getInstancia(){
        if(instancia == null){
            instancia = new ConexionDB();
        }
        return instancia;
    }


    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
