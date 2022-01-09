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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje = "";
        mensaje = promedioCualitativo();
        System.out.println(mensaje);

    }

    public static String promedioCualitativo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double val1;
        double val2;
        double val3;
        double val4;
        double promedio;
        String promedioCualitativo = "";
        String cadena = "";
        System.out.println("Ingrese el primer valor");
        val1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo valor");
        val2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer valor");
        val3 = entrada.nextDouble();
        System.out.println("Ingrese el cuarto valor");
        val4 = entrada.nextDouble();

        promedio = (val1 + val2 + val3 + val4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            promedioCualitativo = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                promedioCualitativo = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    promedioCualitativo = " Muy Bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        promedioCualitativo = " Sobresaliente";
                    }
                }
            }
        }
           
        cadena = String.format("el promedio de las notas %s %s %s %s es %s",
                val1,
                val2,
                val3,
                val4,
                promedioCualitativo);
        return cadena;
    }

}
