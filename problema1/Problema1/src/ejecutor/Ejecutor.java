/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutor;

import problema1.Terreno;

/**
 *
 * @author Usuario
 */
public class Ejecutor {
    public static void main(String[] args) {
        Terreno terreno = new Terreno();
        Terreno terreno2 = new Terreno();
        terreno.establecerAncho(1000);
        terreno.establecerLargo(1000);
        terreno.establecerValorMentros(1000);
        terreno.calcularArea();
        terreno.calcularCosto();
        terreno2.establecerAncho(15000);
        terreno2.establecerLargo(10050);
        terreno2.establecerValorMentros(10050);
        terreno2.calcularArea();
        terreno2.calcularCosto();
        System.out.printf("Terreno 1\nArea = %.2f\nCosto: %.2f\n", 
                terreno.obtenerArea(), terreno.obtenerCosto());
        System.out.printf("Terreno 2\nArea = %.2f\nCosto: %.2f\n", 
                terreno2.obtenerArea(), terreno2.obtenerCosto());
    }
}
