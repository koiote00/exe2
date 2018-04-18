/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filipe
 */
public class Pratica32 {
    
    public static double densidade(double x, double media, double desvio) {
        double d = (1/(Math.sqrt(2*Math.PI)*desvio))*Math.pow(Math.E, (-1.0/2.0)*Math.pow(((x-media)/desvio),2));
        return d;
    }
    public static void main(String[] args) {
        
        double valor= densidade(-1,67,3);
        System.out.println(valor);
    }
        
    }
    

