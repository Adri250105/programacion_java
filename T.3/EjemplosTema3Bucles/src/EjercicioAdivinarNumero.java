import java.util.Scanner;
// import java.util.Random; // Descomentar si vas a usar el número aleatorio

public class EjercicioAdivinarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto;

        // =========================================================================
        // OPCIÓN 1: Ingresar el número por teclado (Ejercicio original)
        // =========================================================================
        System.out.print("Jugador 1, ingresa el número secreto a adivinar: ");
         numeroSecreto = sc.nextInt();

        // Limpiamos la pantalla visualmente con saltos de línea para que el Jugador 2 no lo vea
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


        // =========================================================================
        // OPCIÓN 2: Generar número aleatorio entre 1 y 100 (Con Random)
        // (Para usar esta opción, comenta la Opción 1 de arriba y descomenta estas líneas)
        // =========================================================================
        /*
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        System.out.println("Se ha pensado un número entre 1 y 100.");
        */


        // =========================================================================
        // LÓGICA DEL JUEGO (Uso del interruptor / boolean)
        // =========================================================================
        boolean adivinado = false; // Interruptor inicializado en falso

        System.out.println("Comienza a adivinar:");

        // El bucle se repite mientras el interruptor siga en 'false'
        while (!adivinado) {
            System.out.print("Introduce un número: ");
            int numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroSecreto) {
                adivinado = true; // Se activa el interruptor al acertar
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número secreto es MAYOR.");
            } else {
                System.out.println("El número secreto es MENOR.");
            }
        }

        System.out.println("\n¡Felicidades! Has adivinado el número secreto.\nEl número secreto es: " + numeroSecreto);
        sc.close();
    }
}