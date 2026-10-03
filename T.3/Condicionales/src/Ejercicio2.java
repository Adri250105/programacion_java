import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int num1;
        String operador;
        int resultado;

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        System.out.println("Introduce otro número para la operación: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el operador: ");
        operador = sc.nextLine();

        if (operador == "+"){
            resultado = num+num1;
        } else if (operador == "-") {
            resultado = num-num1;
        } else if (operador == "*") {
            resultado = num*num1;
        } else {
            resultado = num/num1;
        }

        System.out.println("El resultado de la operación es " + resultado);
    }
}
