public class EjercicioSumaParesYProductoImpares {
    public static void main(String[] args) {

        int i = 1;
        int par, impar;
        int sumaPares = 0;
        double productoImpares = 1; // Usar double para evitar overflow

        while (i <= 20) {
            par = 2 * i;
            impar = (2 * i) - 1;

            sumaPares = sumaPares + par;
            productoImpares = productoImpares * impar;

            i++;
        }

        System.out.println("Suma de los primeros 20 pares: " + sumaPares);
        System.out.println("Producto de los 20 primeros impares: " + productoImpares);
    }
}