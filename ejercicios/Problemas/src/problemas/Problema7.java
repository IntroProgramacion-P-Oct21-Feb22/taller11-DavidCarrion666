/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {

        String[] ciudadesEcuador;
        ciudadesEcuador = arreglo();
        ciudades(ciudadesEcuador);

    }

    public static String[] arreglo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        System.out.println("Ingrese el limite del arreglo");
        limite = entrada.nextInt();
        entrada.nextLine();

        String[] ciudadesEcuador = new String[limite];

        for (int i = 0; i < limite; i++) {
            System.out.println("Ingrese el nombre de una ciudad");
            ciudadesEcuador[i] = entrada.nextLine();

        }
        return ciudadesEcuador;
    }

    public static void ciudades(String[] ciudades) {

        String cadena = "";
        for (int i = 0; i < ciudades.length; i++) {

            if ((4 == ciudades[i].length()) || (5 == ciudades[i].length())) {
                cadena = String.format("%s %s\n", cadena, ciudades[i]);
            }
        }

        System.out.printf("las ciudades con 4 o 5 caracteres son:\n%s", cadena);
    }

}
