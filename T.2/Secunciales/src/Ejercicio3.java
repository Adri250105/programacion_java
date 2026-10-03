import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio de las deportivas: ");
        double deportivas = sc.nextDouble();

        System.out.println("Introduce el descuento: ");
        double descuento = sc.nextDouble();

        double precioDescuento = deportivas*descuento;

        System.out.println("Precio con el descuento es de " + precioDescuento + " €");

        sc.close();
    }
}
