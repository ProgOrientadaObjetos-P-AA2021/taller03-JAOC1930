/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author Usuario
 */
public class Institucion {
    private String nombre;
    private String tipoInstitucion;
    private int numeroDocentes;
    private int numeroCedes;
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerTipoIns(String t){
        tipoInstitucion = t;
    }
    public void establecerNumeroDocentes(int n){
        numeroDocentes = n;
    }
    public void establecerNumeroCedes(int n){
        numeroCedes = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerTipoIns(){
        return tipoInstitucion;
    }
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    public int obtenerNumeroCedes(){
        return numeroCedes;
    }
    
}
