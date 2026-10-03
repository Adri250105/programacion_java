import java.util.Scanner;

public class Ejercicio3Amp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean llueve;
        boolean sol;
        int diasRiego;
        int diasAbono;
        boolean regar;
        boolean abonar;

        System.out.println("¿Llueve?");
        llueve = sc.nextBoolean();

        System.out.println("¿Hace sol?");
        sol = sc.nextBoolean();

        System.out.println("¿Cuántos días han pasado desde el último de riego?");
        diasRiego = sc.nextInt();

        System.out.println("¿Cuántos días han pasado desde que abonaste?");
        diasAbono = sc.nextInt();

        regar = !(llueve|| diasRiego < 5 || sol);
        abonar = regar && !(diasAbono < 10);

//        if (!llueve && !sol && diasRiego >= 5){
//            regar = true;
//        } else {
//            regar = false;
//        }
//
//        if (regar && diasAbono >= 10){
//            abonar = true;
//        } else {
//            abonar = false;
//        }

        System.out.println("¿Regar? " + regar);
        System.out.println("¿Abonar? " + abonar);

        sc.close();

    }
}
