package com.singleton.single04;

public class SesionUsuario {

    private static SesionUsuario instancia;
    private String usuario;
    private String rol;
    private boolean sesionActiva;

    private SesionUsuario(){

    }


    public static SesionUsuario getInstancia(){
        if(instancia == null){
            instancia = new SesionUsuario();
        }
        return instancia;
    }


    public void iniciarSesion(String usuario, String rol){
        this.usuario = usuario;
        this.rol = rol;
        this.sesionActiva = true;
    }

    public void cerrarSesion(){
        this.usuario = null;
        this.rol = null;
        this.sesionActiva = false;
    }

    @Override
    public String toString() {
        return "SesionUsuario{" +
                "usuario='" + usuario + '\'' +
                ", rol='" + rol + '\'' +
                ", sesionActiva=" + sesionActiva +
                '}';
    }
}
