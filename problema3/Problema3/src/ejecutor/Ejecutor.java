/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import problema3.Institucion;

/**
 *
 * @author Usuario
 */
public class Ejecutor {
    public static void main(String[] args) {
        Institucion institucion = new Institucion();
        Institucion institucion2 = new Institucion();
        Institucion institucion3 = new Institucion();
        institucion.establecerNombre("UTPL");
        institucion.establecerTipoIns("Privada");
        institucion.establecerNumeroDocentes(100);
        institucion.establecerNumeroCedes(5);
        institucion2.establecerNombre("UNL");
        institucion2.establecerTipoIns("Publica");
        institucion2.establecerNumeroDocentes(60);
        institucion2.establecerNumeroCedes(2);
        institucion3.establecerNombre("UIDE");
        institucion3.establecerTipoIns("Privada");
        institucion3.establecerNumeroDocentes(100);
        institucion3.establecerNumeroCedes(20);
        System.out.printf("Nombre: %s\nTipo de institucion: %s\nNumero de"
                + " docentes: %d\nNumero de Cedes: %d\n", 
                institucion.obtenerNombre(), institucion.obtenerTipoIns(),
                institucion.obtenerNumeroDocentes(), institucion.obtenerNumeroCedes());    
        System.out.printf("Nombre: %s\nTipo de institucion: %s\nNumero de"
                + " docentes: %d\nNumero de Cedes: %d\n", 
                institucion2.obtenerNombre(), institucion2.obtenerTipoIns(),
                institucion2.obtenerNumeroDocentes(), institucion2.obtenerNumeroCedes());  
        System.out.printf("Nombre: %s\nTipo de institucion: %s\nNumero de"
                + " docentes: %d\nNumero de Cedes: %d\n", 
                institucion3.obtenerNombre(), institucion3.obtenerTipoIns(),
                institucion3.obtenerNumeroDocentes(), institucion3.obtenerNumeroCedes());  
    }
    
}
