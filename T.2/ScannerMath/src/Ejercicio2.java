import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int longitud1;
        int longitud2;
        int perimetro;
        double area;

        System.out.println("Introduzca el primer lado del rectángulo: ");
        longitud1 = sc.nextInt();

        System.out.println("Introduzca el segundo lado del rectángulo: ");
        longitud2 = sc.nextInt();

        System.out.println("El rectángulo tiene de lados " + longitud1 + " y " + longitud2);

        System.out.println("Vamos a calcular el perímetro y el área del rectangulo: ");
        System.out.println();
        System.out.println("Cálculo del perímetro: ");

        perimetro = longitud1 + longitud2;
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        area = longitud1 * longitud2;
        System.out.println("El área del rectángulo es: " + area);

        sc.close();
    }
}
