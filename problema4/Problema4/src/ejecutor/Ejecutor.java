/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import problema4.Celular;

/**
 *
 * @author Usuario
 */
public class Ejecutor {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.establecerSistema("Android");
        celular.establecerTamaño(10);
        celular.establecerCosto(200);
        celular.establecerDireccionMac("02;21;68;69");
        celular.establecerInformacionIMEI("123456789012345");
        System.out.printf("Tipo de sistema: %s\nTamaño de pantalla: "
                + "%.2f\nCosto: %.2f\nDireccion Mac: %s\nInformaición "
                + "IMEI: %s\n", celular.obtenerSistema(),
                celular.obtenerTamaño(), celular.obtenerCosto(),
                celular.obtenerDireccionMac(), celular.obtenerInformacionIMEI());
    }
}
