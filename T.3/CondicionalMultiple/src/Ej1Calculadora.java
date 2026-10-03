import java.util.Scanner;

public class Ej1Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado;
        int num1, num2;
        String operador;

        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();

        System.out.println("Introduce un operador: ");
        operador = sc.nextLine();

        switch (operador){
            case "+": resultado = num1 + num2;
                System.out.println("El resultado de la suma es " + resultado);
                break;
            case "-": resultado = num1 - num2;
                System.out.println("El resultado de la resta es " + resultado);
                break;
            case "*": resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es " + resultado);
                break;
            case "/": resultado = num1 / num2;
                System.out.println("El resultado de la división es " + resultado);
                break;
            default:
                System.out.println("Operación incorrecta");
        }

        sc.close();
    }
}
