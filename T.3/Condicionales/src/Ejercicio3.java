import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String turno;
        int horasDiarias = 8; // Asumiendo una jornada de 8 horas diarias
        int diasTrabajados = 5;
        int sueldo = 0;

        System.out.println("¿En qué turno trabaja? (Mañana / Noche / Festivo)");
        turno = sc.nextLine();

        if (turno == "Mañana") {
            sueldo = 600 * horasDiarias * diasTrabajados;
        } else if (turno == "Noche") {
            sueldo = 800 * horasDiarias * diasTrabajados;
        } else if (turno == "Festivo") {
            sueldo = 1000 * horasDiarias * diasTrabajados;
        } else {
            System.out.println("Turno no válido.");
            sc.close();
        }

        System.out.println("El sueldo semanal es: " + sueldo + " pts.");
        sc.close();
    }
}