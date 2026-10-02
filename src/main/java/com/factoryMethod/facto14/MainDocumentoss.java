package com.factoryMethod.facto14;

public class MainDocumentoss {
    public static void main(String[] args){

        Plantilla plantilla = new Plantilla("Huguito", "Las Sirenitas VIP", TipoDocumento.BOLETA, 300.5, "Servicio de una hora todo VIP");

        CreadorDocumento documento = new CreadorBoleta();
        Documento datos = documento.emitir(plantilla);
        datos.mostrarDatos();





    }
}
