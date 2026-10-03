import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cantidadEuros;
        int m1e;
        int m2e;
        int m50c;
        int m20c;
        int m10c;
        int m5c;
        int m2c;
        int m1c;
        int centimos;

        System.out.print("Introduce una cantidad de euros: ");
        cantidadEuros = sc.nextDouble();

        // Convertimos a céntimos y redondeamos para evitar imprecisiones con double
        centimos = (int) Math.round(cantidadEuros * 100);

        // Monedas de 2 Euros (200 céntimos)
        m2e = centimos / 200;
        centimos = centimos % 200;

        // Monedas de 1 Euro (100 céntimos)
        m1e = centimos / 100;
        centimos = centimos % 100;

        // Monedas de 50 Céntimos
        m50c = centimos / 50;
        centimos = centimos % 50;

        // Monedas de 20 Céntimos
        m20c = centimos / 20;
        centimos = centimos % 20;

        // Monedas de 10 Céntimos
        m10c = centimos / 10;
        centimos = centimos % 10;

        // Monedas de 5 Céntimos
        m5c = centimos / 5;
        centimos = centimos % 5;

        // Monedas de 2 Céntimos
        m2c = centimos / 2;
        centimos = centimos % 2;

        // Monedas de 1 Céntimo (lo que queda en 'centimos')
         m1c = centimos;

        // Impresión de resultados
        System.out.println("\nDesglose de monedas mínimo:");
        if (m2e > 0)  System.out.println(m2e + " moneda(s) de 2 euros");
        if (m1e > 0)  System.out.println(m1e + " moneda(s) de 1 euro");
        if (m50c > 0) System.out.println(m50c + " moneda(s) de 50 céntimos");
        if (m20c > 0) System.out.println(m20c + " moneda(s) de 20 céntimos");
        if (m10c > 0) System.out.println(m10c + " moneda(s) de 10 céntimos");
        if (m5c > 0)  System.out.println(m5c + " moneda(s) de 5 céntimos");
        if (m2c > 0)  System.out.println(m2c + " moneda(s) de 2 céntimos");
        if (m1c > 0)  System.out.println(m1c + " moneda(s) de 1 céntimo");

        sc.close();
    }
}