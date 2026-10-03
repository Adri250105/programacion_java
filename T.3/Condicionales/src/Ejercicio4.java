import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pasos;
        double coste;

        System.out.println("Introduzca el número de pasos: ");
        pasos = sc.nextInt();

        if (pasos <= 5){
            coste = 0.10;
            System.out.println("El coste de la llamada es de " + coste + " €");
        } else if (pasos > 5) {
            coste = 0.05;
            System.out.println("El coste de la llamada es de " + coste + " €");
        }
    }
}
