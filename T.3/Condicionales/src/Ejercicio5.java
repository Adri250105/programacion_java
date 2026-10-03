import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num;
        double num1;

        System.out.println("Introduce un número real: ");
        num = sc.nextDouble();

        System.out.println("Introduce otro número real: ");
        num1 = sc.nextDouble();

        System.out.println();

        if (num > num1){
            System.out.println(num1);
            System.out.println(num);
        } else {
            System.out.println(num);
            System.out.println(num1);
        }

        sc.close();
    }
}
