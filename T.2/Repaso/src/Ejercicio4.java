import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letra1;
        char letra2;

        System.out.println("Introduce una letra: ");
        letra1 = sc.next().charAt(0);
        System.out.println("Introduce una letra: ");
        letra2 = sc.next().charAt(0);

        System.out.println("¿Es la misma letra? " + (letra1 == letra2));
    }
}
