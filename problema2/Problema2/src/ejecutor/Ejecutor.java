/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import problema2.EquivalenteHora;

/**
 *
 * @author Usuario
 */
public class Ejecutor {
    public static void main(String[] args) {
        EquivalenteHora equivalente = new EquivalenteHora();
        equivalente.establecerHora(15);
        equivalente.establecerMinutos();
        equivalente.establecerSegundos();
        equivalente.establecerDias();
        System.out.printf("Minutos = %.2f\nSegundos = %.2f\nDias = %.2f\n", 
                equivalente.obtenerMinutos(), equivalente.obtenerSegundos(),
                equivalente.obtenerDias());
    }
}
