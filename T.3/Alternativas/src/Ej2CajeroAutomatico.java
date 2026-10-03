import java.util.Scanner;

public class Ej2CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cantidadRetirar;
        double saldoTotal;
        double saldo = 100.0;
        int opcion;

        System.out.println("1. Consultar saldo\n 2.Retirar dinero\n 3.ingrsar dinero");
        System.out.println();
        System.out.println("¿Qué operación quieres realizar?");
        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Su saldo actual es " + saldo);
        } else if (opcion == 2) {
            System.out.println("Cantidad a retirar: ");
            cantidadRetirar = sc.nextDouble();
            saldoTotal = saldo - cantidadRetirar;

            if (cantidadRetirar < 0){
                System.out.println("No se puede retirar cantidades negativas");
            }

            if (cantidadRetirar > saldo){
                System.out.println("Saldo insuficiente, no se puede retirar " + cantidadRetirar + " €");
            } else if (cantidadRetirar <= saldo) {
                saldoTotal = saldo - cantidadRetirar;
                System.out.println("Saldo restante: " + saldoTotal);
            }
        } else if (opcion == 3) {
            System.out.println("Cantidad a ingresar: ");
            saldo = sc.nextDouble();
            System.out.println("Cantidad ingresada: " + saldo);
            saldoTotal = saldo;
            System.out.println("Saldo actual: " + saldoTotal);

            if (saldo < 0){
                System.out.println("No se puede ingresar cantidades negativas");
            }
        }

        sc.close();
    }
}
