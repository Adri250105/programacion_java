import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //una sentecia
//        System.out.println("Adriana Andrés Visquert\n 25/01/2005");
//        System.out.println();
        //tres sentencias
//        System.out.println("Adriana");
//        System.out.println("Andrés");
//        System.out.println("Visquert");

        //con Scanner

        Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido;
        String apellido2;
        String fechaNacimiento;

        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese su segundo apellido: ");
        apellido2 = sc.nextLine();
        System.out.println("Ingrese su fecha de nacimiento: ");
        fechaNacimiento = sc.nextLine();

        System.out.println("Hola, " + nombre + " " + apellido + " " + apellido2 + "\nFecha de nacimiento: " + fechaNacimiento);

        sc.close();
    }
}
