import java.util.Scanner;

public class Ej2DiasDeLaSemana {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String diaSemana;

        System.out.println("Introduce el día de la semana: ");
        diaSemana = sc.nextLine();

        switch (diaSemana.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día lectivo.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println("Es festivo (fin de semana).");
                break;
            default:
                System.out.println("Día no válido.");
                break;
        }
    }
}