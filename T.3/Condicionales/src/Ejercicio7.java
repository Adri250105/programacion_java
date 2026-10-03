import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Introduce el primer número: ");
        n1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        n2 = sc.nextInt();

        System.out.println("Introduce el tercer número: ");
        n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("El número más grande de los tres es: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("El número más grande de los tres es: " + n2);
        } else {
            System.out.println("El número más grande de los tres es: " + n3);
        }

        sc.close();

    }
}
