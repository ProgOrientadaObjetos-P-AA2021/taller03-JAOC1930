/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author Usuario
 */
public class Terreno {
    private double costo;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
        public void establecerAncho(double a){
            ancho = a;
        }
        public void establecerLargo(double l){
            largo = l;
        }
        public void establecerValorMentros(double v){
            valorMetroCuadrado = v;
        }
        public void calcularArea(){
            area = largo * ancho;
        }
        public void calcularCosto(){
           costo = area * valorMetroCuadrado;   
        }
        public double obtenerAncho(){
            return ancho;
        }
        public double obtenerLargo(){
            return largo;
        }
        public double obtenerValorMentros(){
            return valorMetroCuadrado;
        }
        public double obtenerArea(){
            return area;
        }
        public double obtenerCosto(){
            return costo;
        }
        
         
    }
    

