import java.util.Scanner;

public class EjercicioMultiploDeTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int numero;
        boolean hayMultiplo;

        hayMultiplo = false;
        i = 1;

        while (i<=40){
            System.out.println("Ingrese el número " + i + ":");
            numero = sc.nextInt();

            if (numero % 3 == 0){
                hayMultiplo = true;
            }

            i = i + 1;
        }


        if (hayMultiplo == true){
            System.out.println("Hay " + i + " multiplos de tres");
        }else {
            System.out.println("Ninguno de los números ingresados era múltiplo de 3");
        }

        sc.close();
    }
}
