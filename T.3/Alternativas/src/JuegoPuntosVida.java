import java.util.Scanner;

public class JuegoPuntosVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int puntos = 100;
        int opcion;

        while (puntos > 0) {
            System.out.println("\nElige un camino:");
            System.out.println("1. Entrar en el bosque");
            System.out.println("2. Entrar en la cueva");
            System.out.println("3. Ir al castillo");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Bosque: 70 o más
                    if (puntos >= 70) {
                        System.out.println("Encuentras un tesoro, pero eres atacado por un enemigo.");
                        puntos -= 15;
                    } else {
                        System.out.println("Encuentras a un enemigo más fuerte.");
                        puntos -= 20;
                    }
                    break;

                case 2:
                    // Cueva: 50 o más
                    if (puntos >= 50) {
                        System.out.println("Consigues una espada (+10 puntos de vida).");
                        puntos += 10;
                    } else {
                        System.out.println("Debes escapar.");
                        puntos -= 15;
                    }
                    break;

                case 3:
                    // Castillo: 80 o más
                    if (puntos >= 80) {
                        System.out.println("Puedes entrar al castillo.");
                        puntos -= 5;
                    } else {
                        System.out.println("El guardia no te permite entrar e intentas forzar el paso.");
                        puntos -= 10;
                    }
                    break;

                default:
                    System.out.println("Camino no válido");
                    puntos -= 5;
                    break;
            }

            // Mostrar puntos actuales tras cada elección
            System.out.println("Puntos de vida actuales: " + puntos);
        }

        if (puntos <= 0) {
            System.out.println("\nHas perdido todas tus vidas. Fin de la aventura.");
            puntos = 0;
        }

        sc.close();
    }
}