import java.util.Scanner;

public class Ej3AventuraEligeTuCamino {
    /*
     *
     * El programa original ejecutaba un solo turno con 'puntos = 100'
     * Las condiciones 'puntos < 70' (Bosque) o 'puntos < 50' (Cueva) jamás podían cumplirse, convirtiéndose en código inalcanzable
     *
     * El bucle 'while' permite jugar múltiples turnos acumulando los cambios de estado
     * La opción 4 actúa como condición de parada limpia para evitar bucles infinitos
     *
     * Se añade 'energia' para simular el desgaste del viaje en cada opción.
     * Si la energía cae de 50, se aplican penalizaciones de vida,
     * haciendo que los valores de salud bajen y se puedan ejecutar
     * todas las ramas condicionales del enunciado original
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * Se introduce 'energia' para evitar el problema de código inalcanzable.
         * Al consumir energía en cada ruta, permitimos que la salud baje
         * y se puedan ejecutar todas las opciones del enunciado.
         */
        int puntos = 100;
        int energia = 100;
        int opcion;

        System.out.println("1. Entrar en el bosque\n2. Entrar en la cueva\n3. Ir al castillo\n4. Salir");
        System.out.println("Elige una opción:");
        opcion = sc.nextInt();

        /*
         * - Bucle 'while': Transforma el programa en iterativo para poder realizar
         *   múltiples acciones seguidas conservando el estado de 'puntos' y 'energia'.
         * - Opción 4 ('Salir'): Actúa como condición de parada voluntaria para
         *   evitar un bucle infinito y permitir una salida limpia del programa.
         */
        while (opcion != 4 && puntos > 0 && energia > 0){
            if (opcion == 1){

                energia = energia -25;

                if (energia < 50){
                    puntos = puntos - 20;
                }
                if (puntos >= 70){
                    System.out.println("Has encontrado un tesoro");
                } else if (puntos < 70) {
                    System.out.println("Te has encontrado con un enemigo, pierdes 20 puntos");
                    puntos = puntos - 20;
                }
            } else if (opcion == 2) {

                energia = energia - 30;

                if (energia < 50){
                    puntos = puntos - 20;
                }
                if (puntos >= 50){
                    System.out.println("Has conseguido una espada");
                } else if (puntos < 50) {
                    System.out.println("Debes escapar");
                    puntos = puntos -10;
                }
            } else if (opcion == 3){

                energia = energia - 40;

                if (energia < 50){
                    puntos = puntos - 20;
                }
                if (puntos >= 80){
                    System.out.println("Puede entrar");
                } else if (puntos < 80) {
                    System.out.println("El guardían no te deja pasar");
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo del juego...");
            } else {
                System.out.println("Opción no válida");
            }

            System.out.println();

            System.out.println("Te quedan " + puntos + " puntos");
            System.out.println("Te quedan " + energia + " energía");

            System.out.println();

            if (puntos > 0 && energia > 0) {
                System.out.println("1. Entrar en el bosque\n2. Entrar en la cueva\n3. Ir al castillo\n4. Salir");
                System.out.println("Elige una opción:");
                opcion = sc.nextInt();
            }

        }

        if (puntos <= 0){
            puntos = 0;
            System.out.println("Te has quedado sin vidas");
        } else if (energia <= 0) {
            energia = 0;
            System.out.println("Te has quedado sin energía");
        }else {
            System.out.println("Has salido del juego");
        }

        sc.close();

        System.out.println("Te quedan " + puntos + " puntos");
        System.out.println("Te quedan " + energia + " energía");

    }
}