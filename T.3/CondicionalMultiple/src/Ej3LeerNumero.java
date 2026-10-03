import java.util.Scanner;

public class Ej3LeerNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //int num;
//
//        System.out.println("Introduce un número entero del 0 al 9: ");
//        num = sc.nextInt();

        int num = 0;
        int decenas = 0;
        int unidades = 0;
        String textoDecena = "";
        String textoUnidad = "";


        System.out.print("Introduce un número entero del 0 al 100: ");
        num = sc.nextInt();


        if (num < 0 || num > 100) {
            System.out.println("Número no válido");
        } else if (num == 100) {
            System.out.println("Cien");
        } else if (num == 0) {
            System.out.println("Cero");
        } else {
            // Cálculo de decenas y unidades
            decenas = num / 10;
            unidades = num % 10;

            // Obtener texto de las unidades
            switch (unidades) {
                case 1: textoUnidad = "Uno"; break;
                case 2: textoUnidad = "Dos"; break;
                case 3: textoUnidad = "Tres"; break;
                case 4: textoUnidad = "Cuatro"; break;
                case 5: textoUnidad = "Cinco"; break;
                case 6: textoUnidad = "Seis"; break;
                case 7: textoUnidad = "Siete"; break;
                case 8: textoUnidad = "Ocho"; break;
                case 9: textoUnidad = "Nueve"; break;
            }

            // Manejo de las decenas y casos especiales
            switch (decenas) {
                case 1:
                    switch (unidades) {
                        case 0: System.out.println("Diez"); return;
                        case 1: System.out.println("Once"); return;
                        case 2: System.out.println("Doce"); return;
                        case 3: System.out.println("Trece"); return;
                        case 4: System.out.println("Catorce"); return;
                        case 5: System.out.println("Quince"); return;
                        case 6: System.out.println("Dieciséis"); return;
                        default:
                            // Para 17, 18 y 19
                            System.out.println("Dieci" + textoUnidad.toLowerCase());
                            return;
                    }
                case 2:
                    if (unidades == 0) {
                        System.out.println("Veinte");
                        return;
                    } else if (unidades == 2) {
                        System.out.println("Veintidós");
                        return;
                    } else if (unidades == 3) {
                        System.out.println("Veintitrés");
                        return;
                    } else if (unidades == 6) {
                        System.out.println("Veintiséis");
                        return;
                    } else {
                        textoDecena = "Veinti";
                    }
                    break;
                case 3: textoDecena = "Treinta"; break;
                case 4: textoDecena = "Cuarenta"; break;
                case 5: textoDecena = "Cincuenta"; break;
                case 6: textoDecena = "Sesenta"; break;
                case 7: textoDecena = "Setenta"; break;
                case 8: textoDecena = "Ochenta"; break;
                case 9: textoDecena = "Noventa"; break;
            }


            if (decenas == 0) {
                System.out.println(textoUnidad);
            } else if (decenas == 2) {
                System.out.println(textoDecena + textoUnidad.toLowerCase());
            } else if (unidades == 0) {
                System.out.println(textoDecena);
            } else {
                System.out.println(textoDecena + " y " + textoUnidad.toLowerCase());
            }
        }


//
//        switch (num){
//            case 0:
//                System.out.println("Cero"); break;
//            case 1:
//                System.out.println("Uno"); break;
//            case 2:
//                System.out.println("Dos"); break;
//            case 3:
//                System.out.println("Tres"); break;
//            case 4:
//                System.out.println("Cuatro"); break;
//            case 5:
//                System.out.println("Cinco"); break;
//            case 6:
//                System.out.println("Seis"); break;
//            case 7:
//                System.out.println("Siete"); break;
//            case 8:
//                System.out.println("Ocho"); break;
//            case 9:
//                System.out.println("Nueve"); break;
//            default:
//                System.out.println("Número no válido");
//        }

    }
}
