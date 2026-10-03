import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double Parcial1;
        double Parcial2;

        System.out.println("Ingrese la nota del primer parcial: ");
        Parcial1 = sc.nextDouble();

        System.out.println("Ingrese la nota del segundo parcial: ");
        Parcial2 =  sc.nextDouble();

        double Final = (Parcial1 + Parcial2)/2;

        System.out.println("PROGAMACIÓN");
        System.out.println("Parcial1 = " + Parcial1);
        System.out.println("Parcial2 = " + Parcial2);
        System.out.println("Final = " + Final);

        sc.close();
    }
}
