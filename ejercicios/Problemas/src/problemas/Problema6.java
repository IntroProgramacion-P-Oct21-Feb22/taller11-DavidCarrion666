/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        double media;
        double desviacion;
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        media = sumaDatos(informacion);
        System.out.printf("La media de los datos es %.2f\n", media);
        desviacion = desviacion(informacion, media);
        System.out.printf("La desviacion de los datos es %.2f\n", desviacion);
    }

    // 1        2       3
    // 10       20      30
    // 100      200     300
    public static double sumaDatos(int[] datos) {
        int suma = 0;
        double media;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        media = suma / datos.length;
        return media;
    }

    public static double desviacion(int[] datos, double media) {
        double suma = 0;
        double desviacion;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + Math.pow(datos[i] - media, 2);
        }
        
        desviacion = suma / datos.length;
        desviacion = Math.sqrt(desviacion);
        return desviacion;
    }

}
