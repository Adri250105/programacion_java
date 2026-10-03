import java.util.Scanner;

public class AmpliarEj3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double anguloGrados;
        double opuesto;
        double anguloRadianes;
        double hipotenusaForma1;
        double adyacente;
        double hipotenusaForma2;

        System.out.print("Introduce el ángulo en grados (θ): ");
        anguloGrados = sc.nextDouble();

        System.out.print("Introduce la longitud del lado opuesto: ");
        opuesto = sc.nextDouble();

        // Convertimos el ángulo a radianes para las funciones trigonométricas
        anguloRadianes = Math.toRadians(anguloGrados);

        // Forma 1: En un paso -> Hipotenusa = Opuesto / sen(θ)
        hipotenusaForma1 = opuesto / Math.sin(anguloRadianes);

        // Forma 2: En dos pasos
        // Paso 1: Adyacente = Opuesto / tan(θ)
        adyacente = opuesto / Math.tan(anguloRadianes);
        // Paso 2: Hipotenusa = sqrt(Adyacente^2 + Opuesto^2)
        hipotenusaForma2 = Math.sqrt(Math.pow(adyacente, 2) + Math.pow(opuesto, 2));

        // Resultados
        System.out.println("Hipotenusa (Forma 1 - Un paso): " + hipotenusaForma1);
        System.out.println("Hipotenusa (Forma 2 - Dos pasos): " + hipotenusaForma2);

        sc.close();
    }
}
