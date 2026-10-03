import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String diaSemana;
//        int diaSemana;
//
//        System.out.println("Introduce el día de la semana (1-Lunes, 2-Martes, 3-Miércoles, 4-Jueves, 5-Viernes, 6-Sábado, 7-Domingo): ");
//        diaSemana = sc.nextInt();
//
//        // Validamos si es un día de la semana (1 al 7)
//        if (diaSemana >= 1 && diaSemana <= 5) {
//            System.out.println("Es un día LECTIVO");
//        } else if (diaSemana == 6 || diaSemana == 7) {
//            System.out.println("Es FESTIVO");
//        } else {
//            System.out.println("Número no válido. Debe ser un valor entre 1 y 7");
//        }

        System.out.print("Introduce un día de la semana: ");
        diaSemana = sc.nextLine();

        // Evaluamos el día ingresado ignorando mayúsculas y minúsculas
        if (diaSemana.equalsIgnoreCase("Lunes") ||
                diaSemana.equalsIgnoreCase("Martes") ||
                diaSemana.equalsIgnoreCase("Miércoles") ||
                diaSemana.equalsIgnoreCase("Miercoles") ||
                diaSemana.equalsIgnoreCase("Jueves") ||
                diaSemana.equalsIgnoreCase("Viernes")) {

            System.out.println("El " + diaSemana + " es un día LECTIVO.");

        } else if (diaSemana.equalsIgnoreCase("Sábado") ||
                diaSemana.equalsIgnoreCase("Sabado") ||
                diaSemana.equalsIgnoreCase("Domingo")) {

            System.out.println("El " + diaSemana + " es FESTIVO (fin de semana).");

        } else {
            System.out.println("El texto introducido no corresponde a un día de la semana válido.");
        }

//        switch (diaSemana.toLowerCase()) {
//            case "lunes":
//            case "martes":
//            case "miércoles":
//            case "miercoles":
//            case "jueves":
//            case "viernes":
//                System.out.println("Es un día LECTIVO.");
//                break;
//            case "sábado":
//            case "sabado":
//            case "domingo":
//                System.out.println("Es FESTIVO (fin de semana).");
//                break;
//            default:
//                System.out.println("Día no válido.");
//                break;
//        }

         sc.close();
    }
}