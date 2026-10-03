import java.util.Scanner;

public class Ej1Semaforo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color;

        System.out.println("¿De que color está el semáforo?");
        color = sc.nextLine();

        if (color.equalsIgnoreCase("Rojo")){
            System.out.println("Debes detenerte");
        } else if (color.equalsIgnoreCase("Amarillo")) {
            System.out.println("Precaución");
        } else if (color.equalsIgnoreCase("Verde")) {
            System.out.println("Puedes continuar");
        } else {
            System.out.println("Color no válido");
        }

        sc.close();
    }
}
