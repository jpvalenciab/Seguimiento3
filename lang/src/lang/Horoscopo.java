/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lang;

import java.util.ArrayList;

/**
 *
 * @author jenny.valencia
 */
public class Horoscopo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hacer un horóscopo con frases dentro de un ArrayList

        lista();
    }

    public static void lista() {
        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("Aries: Es el signo que tiene mayor poder de dominio y liderazgo");
        miLista.add("Tauro: Su forma de trnsmitir lo que sienten conquista los corazones");
        miLista.add("Géminis: Suelen ser el centro de atención");
        miLista.add("Cáncer: Son líderes genuinos que no le temen a nada");
        miLista.add("Leo: Siempre y disfrutan de compartir su felicidad con los que lo rodean");
        miLista.add("Virgo: Casi nunca siguen los consejos de otros");
        miLista.add("Libra: Se preocupan mucho por los demás");
        miLista.add("Escorpio: Pueden ser intensos pero cuando los conocen de verdad, todos los adoran");
        miLista.add("Sagitario: Son personas con la mente muy abierta");
        miLista.add("Capricornio: Están intentando superarse y buscan aprender algo nuevo");
        miLista.add("Acuario: Viven para ellos mismos");
        miLista.add("Piscis: Son criticadas por vivir distraídas");

        System.out.println(miLista);
        int size = miLista.size();
        System.out.println(size);

    }
}
