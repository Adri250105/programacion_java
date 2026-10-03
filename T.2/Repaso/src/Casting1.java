public class Casting1 {
    public static void main(String[] args) {
        /*
        * el código daba error porque los tipos de datos byte y short son demasiado pequellos como para almacenar datos
        * como las edades, los sueldos y sus complementos
         */
        int edadJuan=20;
        int edadPedro=edadJuan+1;
        int sueldoBase= 1980;
        int complementos= 400;
        int sueldoTotal;
        sueldoTotal=sueldoBase+complementos;
    }
}
