/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author Usuario
 */
public class Celular {
    private String sistemaO;
    private double tamañoP;
    private double costo;
    private String direccionMac;
    private String informacionIMEI;
    public void establecerSistema(String s){
        sistemaO = s;
    }
    public void establecerTamaño(double t){
        tamañoP = t;
    }
    public void establecerCosto(double c){
        costo = c;
    }
    public void establecerDireccionMac(String d){
        direccionMac = d;
    }
    public void establecerInformacionIMEI(String i){
        informacionIMEI = i;
    }
    public String obtenerSistema(){
        return sistemaO;
    }
    public double obtenerTamaño(){
        return tamañoP;
    }
    public double obtenerCosto(){
        return costo;
    }
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    public String obtenerInformacionIMEI(){
        return informacionIMEI;
    }
}
