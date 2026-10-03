public class Ejercicio6 {
    public static void main(String[] args) {

        double area;
        double volumen;

        final double PI = 3.14;

        double diametro = 15.5;
        double altura = 42.4;

        double radio = diametro/2;

        area = 2 * PI * radio * (altura + radio);

        volumen = PI * (radio * radio) * altura;

        System.out.println("Area del cilindro es " + area);
        System.out.println("Volumen del cilindro " + volumen);

    }
}
