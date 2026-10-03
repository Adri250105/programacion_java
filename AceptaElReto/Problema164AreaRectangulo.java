import java.util.Scanner;

public class Problema164AreaRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, x2;
        int y1, y2;
        double area;

        System.out.println("Introduce los valores del punto X");
        System.out.println("Introduce el valor de x1: ");
        x1 = sc.nextInt();
        System.out.println("Introduce el valor de x2: ");
        x2 = sc.nextInt();

        System.out.println();

        System.out.println("Introduce los valores del punto Y");
        System.out.println("Introduce el valor de y1: ");
        y1 = sc.nextInt();
        System.out.println("Introduce el valor de y2: ");
        y2 = sc.nextInt();

        while ((x1 < x2) && (y1 < y2)){
            area = (x2 - x1)*(y2 -y1);
            System.out.println("El área del rectángulo es: " + area);

            System.out.println("Introduce el valor de x1: ");
            x1 = sc.nextInt();
            System.out.println("Introduce el valor de x2: ");
            x2 = sc.nextInt();

            System.out.println();

            System.out.println("Introduce los valores del punto Y");
            System.out.println("Introduce el valor de y1: ");
            y1 = sc.nextInt();
            System.out.println("Introduce el valor de y2: ");
            y2 = sc.nextInt();
        }


    }
}
