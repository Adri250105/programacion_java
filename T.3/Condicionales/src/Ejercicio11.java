import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anyo;
        int diasMaximos;
        boolean esBisiesto;
        boolean fechaValida = true;

        System.out.print("Introduce el día: ");
        dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        anyo = sc.nextInt();

        // 1. Validar rango del año
        if (anyo < 1970 || anyo >= 3000) {
            fechaValida = false;
        }

        // 2. Validar rango del mes
        if (mes < 1 || mes > 12) {
            fechaValida = false;
        }

        
        /*
         * Un año es bisiesto si es divisible por 4 (anyo % 4 == 0) Y NO es divisible por 100 (anyo % 100 != 0).
         * Excepción: Si es un año de fin de siglo (divisible por 100), solo será bisiesto si también es
         * divisible por 400 (anyo % 400 == 0)
         */
        esBisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);

        // 4. Determinar los días máximos según el mes
        if (fechaValida) {
            if (mes == 2) {
                if (esBisiesto) {
                    diasMaximos = 29;
                } else {
                    diasMaximos = 28;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasMaximos = 30;
            } else {
                diasMaximos = 31;
            }

            // 5. Validar rango del día
            if (dia < 1 || dia > diasMaximos) {
                fechaValida = false;
            }
        }


        if (fechaValida) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anyo + " es VÁLIDA.");
        } else {
            System.out.println("La fecha introducida NO es válida.");
        }

        sc.close();
    }
}