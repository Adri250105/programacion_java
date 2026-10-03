import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seg;
        int totalSegundos;
        int dias;
        int min;
        int horas;
        int residuo;

        System.out.print("Introduce una cantidad de segundos: ");
        totalSegundos = sc.nextInt();

        // 1. Días y el residuo de segundos que quedan
        dias = totalSegundos / 86400;
        residuo = totalSegundos % 86400;

        // 2. Horas y el nuevo residuo de segundos
        horas = residuo / 3600;
        residuo = residuo % 3600;

        // 3. Minutos y los segundos finales que quedan
        min = residuo / 60;
        seg = residuo % 60;

        System.out.println(totalSegundos + " segundos son: " + dias + " días, " + horas + " horas, " + min + " min y " + seg + " seg.");

        sc.close();
    }
}