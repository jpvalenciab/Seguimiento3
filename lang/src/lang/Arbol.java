/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

/**
 *
 * @author jenny.valencia
 */
public class Arbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa para calcular la altura del árbol
        //x = mi distancia en metros de la base del arbol
        //y = angulo de la copa del arbol

        double x = 20;
        double y = 35;

        x = Math.toRadians(x);
        y = Math.toRadians(y);
        
        double r = Math.hypot(x, y);
        double aRad = Math.atan2(y, x);
        double a = Math.toDegrees(aRad);
        
        System.out.println("Para x = " + x + " y = " + y);
        System.out.println("r =" + r);
        System.out.println("a = " + a + "°");
        
        double misRadianes = 0;
        
        double valor = Math.tan(misRadianes);
        int angulo = 35;
        System.out.println("Tangente de" + angulo + "° = "+ valor);

        System.out.println("Math.tanh(" + x + ")=" + Math.tanh(x));
        System.out.println("Math.tanh(" + x + ")=" + Math.tanh(y));
 
        
        
                
    }

}
