import java.util.Scanner;

public class Problema112RadaresDeTramo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanciaCamaras;
        int velocidadMaxPermitida;
        int tiempo;
        double velocidadMedia;

        System.out.println("Introduce la distacia entre las dos cámaras: ");
        distanciaCamaras = sc.nextInt();

        System.out.println("Introduce la volocidad máxima permitida: ");
        velocidadMaxPermitida = sc.nextInt();

        System.out.println("¿Cuánto tiempo has tardado en recorrer la distancia?");
        tiempo = sc.nextInt();

        while (distanciaCamaras != 0 || velocidadMaxPermitida != 0 || tiempo != 0){

            if (tiempo <= 0 || distanciaCamaras < 0){
                System.out.println("ERROR");
            } else {
                velocidadMedia = (distanciaCamaras*3.6)/tiempo;

                if (velocidadMedia <= velocidadMaxPermitida) {
                    System.out.println("OK");
                } else if (velocidadMedia < velocidadMaxPermitida * 1.20) {
                    System.out.println("MULTA");
                }else {
                    System.out.println("PUNTOS");
                }
            }

            System.out.println("Introduce la distacia entre las dos cámaras: ");
            distanciaCamaras = sc.nextInt();

            System.out.println("Introduce la volocidad máxima permitida: ");
            velocidadMaxPermitida = sc.nextInt();

            System.out.println("¿Cuánto tiempo has tardado en recorrer la distancia?");
            tiempo = sc.nextInt();
        }
    }
}
