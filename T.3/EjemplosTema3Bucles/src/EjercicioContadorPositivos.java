import java.util.Scanner;

public class EjercicioContadorPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int i = 1;
        double num;

        System.out.println("Ingresa 100 número: ");

        while (i <= 100){
            System.out.println("Número " + i + ": ");
            num = sc.nextDouble();

            if (num > 0){
                positivos++;
            }
            i++;
        }

        System.out.println("\nTotal de número ingresados: " + positivos);

        sc.close();

    }
}