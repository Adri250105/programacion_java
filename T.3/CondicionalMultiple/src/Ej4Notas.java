import java.util.Scanner;

public class Ej4Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Introduce una calificación de número entero:");
        nota = sc.nextInt();

        switch (nota){
            case 0:
            case 1:
            case 2:
                System.out.println("Muy Deficiente"); break;
            case 3:
            case 4:
                System.out.println("Insuficiente"); break;
            case 5:
            case 6:
                System.out.println("Bien"); break;
            case 7:
            case 8:
                System.out.println("Notable"); break;
            case 9:
            case 10:
                System.out.println("Sobresaliente"); break;
            default:
                System.out.println("Error: Nota no válida");
        }

        sc.close();
    }
}