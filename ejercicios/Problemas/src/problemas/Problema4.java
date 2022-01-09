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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        System.out.println("Ingrese 1 para calcular el valor de la planilla de "
                + "luz, o Ingrese 2 para calcular el valor del predio de un bien"
                + " inmueble.");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            calcularValorLuz();
        } else {
            if (tipo == 2) {
                calcularPrecio();
            } else {
                    mensaje = "opción incorrecta";
                }
            }
              System.out.println(mensaje);
        }
  

    public static void calcularValorLuz() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int cedula;
        double valorKilowatio;
        double numeroKilowatio;
        double total
                ;
        System.out.println("Ingrese el nombre del usuario");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese la cedula del usuario");
        cedula = entrada.nextInt();
        
        System.out.println("Ingrese el valor del Kilowatio");
        valorKilowatio = entrada.nextDouble();
        
        System.out.println("Ingrese el numero de kilowatios consumidos");
        numeroKilowatio = entrada.nextDouble();
        
        total = valorKilowatio * numeroKilowatio;

        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de "
                + "%s", 
                nombre,
                cedula,
                total);
    }

    public static void calcularPrecio() {
      Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int cedula;
        double valorInmueble;
        double porcentaje;
        double total
                ;
        System.out.println("Ingrese el nombre del usuario");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese la cedula del usuario");
        cedula = entrada.nextInt();
        
        System.out.println("Ingrese el valor del bien inmueble");
        valorInmueble = entrada.nextDouble();
        

        porcentaje = (valorInmueble * 2) / 100;


        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble "
                + "valorado en %s  y tiene que pagar de precio %.2f", 
                nombre,
                cedula,
                valorInmueble,
                porcentaje);
    }
}
