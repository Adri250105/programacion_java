public class Ejercicio5 {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        //a)
        int resultado = -a + 5 % b -a * a;
        System.out.println("Resultado: " + resultado);

        //b)
        int resultado2 = 5 + 3 % 7 * b * a - b % a;
        System.out.println("Resultado: " + resultado2);

        //c)
        int resultado3 = (a+1) * (b+1) - b/a;
        System.out.println("Resultado: " + resultado3);

        //d)
        int resultado4 = (a/1) * ((a+2)/b);
        System.out.println("Resultado: " + resultado4);
    }
}
