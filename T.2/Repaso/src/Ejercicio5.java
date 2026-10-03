import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cad1;
        String cad2;
        boolean cad;

        System.out.println("Introduce una cadena: ");
        cad1 = sc.nextLine();

        System.out.println("Introduce una cadena: ");
        cad2 = sc.nextLine();

        cad = cad1.equals(cad2);

        System.out.println("¿Es la misma cadena?");
        System.out.println(cad);

    }
}
