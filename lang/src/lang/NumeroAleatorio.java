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
public class NumeroAleatorio {

    public static void main(String[] args) {
        //Programa que genere un número aleatorio de 6 dígitos

        int aleatorio = 0;
        aleatorio = (int) (Math.random() * 1000000);

        System.out.println(aleatorio);

        //int num1 = (int) Math.random();
        //System.out.println(num1);
        //int num2 = (int) (Math.random()*6);
        //System.out.println(num2);
    }

}
