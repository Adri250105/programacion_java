package Boletin1;

import java.util.Scanner;

public class Ejercicio1 {

    /*1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
    debe indicarlo.*/

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a,b,c; //coeficientes ax^2 + 2 + bx + c = 0
        double x1, x2, d; //soluciones y determinante

        System.out.println("Introduce el primer coeficiente (a): ");
        a = sc.nextDouble();
        System.out.println("Introduce el segundo coeficiente (b): ");
        b = sc.nextDouble();
        System.out.println("Introduce el tercer coeficiente (c): ");
        c = sc.nextDouble();

        //cálculo del determinante
        d = ((b*b)-4*a*c);

        if (d<0){
            System.out.println("No existen soluciones reales");
        } else {
            //confirmamos que sea distinto de 0
            //si a = 0 nos encontramos ante una división por cero
            x1=(-b+Math.sqrt(d)/(2*a));
            x2=(-b-Math.sqrt(d)/(2*a));

            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        }
    }
}
