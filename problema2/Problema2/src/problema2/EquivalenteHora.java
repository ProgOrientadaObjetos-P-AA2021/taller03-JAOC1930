/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author Usuario
 */
public class EquivalenteHora {
    private double hora;
    private double minutos;
    private double segundos;
    private double dias;
    public void establecerHora(double h){
        hora = h;
    }
    public void establecerMinutos(){
        minutos = hora * 60;
    }
    public void establecerSegundos(){
        segundos = minutos * 60;
    }
    public void establecerDias(){
        dias = hora / 24;
    }
    public double obtenerHora(){
        return hora;
    }
    public double obtenerMinutos(){
        return minutos;
    }
    public double obtenerSegundos(){
        return segundos;
    }
    public double obtenerDias(){
        return dias;
    }
    
}
