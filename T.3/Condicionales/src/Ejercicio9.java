import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas = 0;
        int min = 0;
        int segundos = 0;

        System.out.println("Introduce una hora: ");
        horas = sc.nextInt();

        System.out.println("Introduce los minutos: ");
        min = sc.nextInt();

        System.out.println("Introduce los segundos: ");
        segundos = sc.nextInt();

        segundos++;

        if (segundos == 60){
            segundos = 0;
            min++;
            if (min == 60){
                min = 0;
                horas++;
                if (horas == 24){
                    horas = 0;
                }
            }
        }
        System.out.println("La hora dentro de un segundo será: " + horas + ":" + min + ":" + segundos);

        sc.close();
    }
}
