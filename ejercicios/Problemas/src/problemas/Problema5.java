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
public class Problema5 {

    public static void main(String[] args) {
        int mensaje;
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        mensaje = sumaDatos(informacion);
       
        System.out.println(mensaje);
    }

    // 1        2       3
    // 10       20      30
    // 100      200     300
    public static int sumaDatos(int[][] datos) {
        int suma = 0;
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                suma = suma + datos[f][c];
                }
            }
        return suma;
        }

    }

