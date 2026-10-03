import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadInicial;

        double interesesAnuales;
        double interesesAl6Meses;
        double retencionHacienda;
        double interesNeto;
        double cantidadFinal;

        System.out.println("Introduce la cantidad a ingresar: ");
        cantidadInicial = sc.nextInt();

        interesesAnuales = cantidadInicial * 0.0275;
        interesesAl6Meses = interesesAnuales/2;
        retencionHacienda = interesesAl6Meses * 0.18;
        interesNeto = interesesAl6Meses - retencionHacienda;
        cantidadFinal = cantidadInicial + interesNeto;

        System.out.println("Cantidad Final: " + cantidadFinal);

        sc.close();
    }
}
