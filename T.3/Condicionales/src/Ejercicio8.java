import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Inicialización de todas las variables al principio
        Scanner sc = new Scanner(System.in);
        int edad;
        double cuotaBase = 500.0;
        double cuotaFinal = 500.0;

        // Variables de descuento inicializadas
        double descuentoMayores = 0.50;        // 50%
        double descuentoMenorSocio = 0.35;      // 35%
        double descuentoMenorNoSocio = 0.25;    // 25%

        boolean padresSocios;

        System.out.print("Introduce la edad: ");
        edad = sc.nextInt();

        if (edad > 65) {
            cuotaFinal = cuotaBase * (1.0 - descuentoMayores);
        } else if (edad < 18) {
            System.out.print("¿Sus padres son socios? ");
            padresSocios = sc.nextBoolean();

            if (padresSocios) {
                cuotaFinal = cuotaBase * (1.0 - descuentoMenorSocio);
            } else {
                cuotaFinal = cuotaBase * (1.0 - descuentoMenorNoSocio);
            }
        }

        System.out.println("Su cuota a abonar es de " + cuotaFinal + " €");

        sc.close();
    }
}