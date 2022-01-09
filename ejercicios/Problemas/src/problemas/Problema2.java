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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        System.out.println("Ingrese 1 para obtener el area de un cuadrado. "
                + "Ingrese 2 para obtener el área de un triangulo o Ingrese 3"
                + " para obtener el área de un rectángulo");
        int tipo = entrada.nextInt();
        if (tipo == 1) {
            obtenerAreaCuadrado();
        } else {
            if (tipo == 2) {
                obtenerAreaTriangulo();
            } else {
                if (tipo == 3) {
                   obtenerAreaRectangulo();
                } else {
                    mensaje = "opción incorrecta";
                }
            }
        }
        System.out.println(mensaje);
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double lados;
        double area;
        System.out.println("Ingrese el valor de los lados del cuadrado");
        lados = entrada.nextDouble();
        area = lados * lados * lados * lados;
        
        System.out.printf("el área del cuadrado es: %.2f\n", area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la altura del triangulo");
        altura = entrada.nextDouble();
        System.out.println("Ingrese el valor de la base del triangulo");
        base = entrada.nextDouble();
        area = (base * altura) / 2;
        
        System.out.printf("el área del triangulo es: %.2f\n", area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la altura del rectangulo");
        altura = entrada.nextDouble();
        System.out.println("Ingrese el valor de la base del rectangulo");
        base = entrada.nextDouble();
        area = base * altura;
        
        System.out.printf("el área del rectangulo es: %.2f\n", area);
    }
}
