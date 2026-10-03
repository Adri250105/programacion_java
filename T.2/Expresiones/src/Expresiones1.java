public class Expresiones1 {
    public static void main(String[] args){

        System.out.println("Mis expresiones");
        System.out.println("---------------");
        System.out.println("a) 24 % 5 = " + 24 % 5); //4
        System.out.println("b) 7/2 + 2.5 = " + 7/2 + 2.5); //32.5
        System.out.println("c) 10.8/2 + 2 = " + 10.8/2 + 2); //5.42
        System.out.println("d) 16/3 *2 -4 * 5 /2 = " + (16/3 *2 -4 * 5 /2)); //0
        System.out.println("e) (4+6)*3+2*(5.5-1) = " + (4+6)*3+2*(5.5-1)); //309.0
        System.out.println("f) 5/2 + 17 % 3 = " + 5/2 + 17 % 3); //22

        System.out.println("-----------------------------------------------------------------------------------------------------------");

        System.out.println("a) 7>=5 && 27 == 8 => " + (7>=5 && 27 == 8)); //true && false => false
        System.out.println("b) 45 <= 7 || ! ( 5 >= 7 ) => " + (45 <= 7 || ! ( 5 >= 7 ))); //false || true => true
        System.out.println("c) 8 > 8 || 7 == 7 && ! ( 5 < 5 ) =>" + (8 > 8 || 7 == 7 && ! ( 5 < 5 ))); //true
        System.out.println("d) 4 + 2 < 8 && 24 + 1 == 25 || false => " + (4 + 2 < 8 && 24 + 1 == 25 || false)); //true
        System.out.println("e) ( 2 * 7 > 5 || 7 / 2 == 3 ) && ( 7 > 25 || ! true ) && true => " + (( 2 * 7 > 5 || 7 / 2 == 3 ) && ( 7 > 25 || ! true ) && true)); //false
        System.out.println("f) 35 > 47 && 9 == 9 || 35 == 3 + 2 && 3 >= 3 => " + (35 > 47 && 9 == 9 || 35 == 3 + 2 && 3 >= 3)); //false

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.println("a) (6^2 + ( 8 - 2 ) ) / 7+ 35 / 2 - 8 * 5 / 4* 2 => " + ((6^2 + ( 8 - 2 ) ) / 7+ 35 / 2 - 8 * 5 / 4* 2)); //1
        System.out.println("b) 4 > 5 || ! ( 45 == 7 ) && 7 + 3 <5 -2 => " + (4 > 5 || ! ( 45 == 7 ) && 7 + 3 <5 -2)); //false
        System.out.println("c) 27 % 4 + 15/ 4 => " + (27 % 4 + 15/ 4)); //6
        System.out.println("d) 37 /4^2– 2 => " + (37 /4^2 + -2)); //9
        System.out.println("e) 9 * 2 / 3 * 25 *3 => " + (9 * 2 / 3 * 25 *3)); //450
        System.out.println("f) (7 *3 - 4 * 4 ) *2 / 4 * 2 => " + ((7 *3 - 4 * 4 ) *2 / 4 * 2)); //4
        System.out.println("g) 25 >= 7 && ! (7 <=2) => " + (25 >= 7 && ! (7 <=2))); //true
        System.out.println("h) 24>5 && 10 <=0 || 10 == 5 => " + (24>5 && 10 <=0 || 10 == 5)); //false
        System.out.println("i) (10 >= 15 || 23==13) && ! (8 == 8) => " + ((10 >= 15 || 23==13) && ! (8 == 8))); //false
        System.out.println("j) (! (6 / 3 >3 ) || 7 > 7) && (3 <= 9/ 2 || 2 + 3 <= 7 / 2) => " + ((! (6 / 3 >3 ) || 7 > 7) && (3 <= 9/ 2 || 2 + 3 <= 7 / 2))); //true
        System.out.println("k) \"Juan \" + \"Rodríguez \" => " + "Juan " + "Rodríguez"); //Juan Rodríguez
        System.out.println("l) 'H' < 'J' || '9' == '7' => " + ('H' < 'J' || '9' == '7')); //true
        System.out.println("m) IGUAL == igual => " + false); //false

        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        System.out.println("Escribir la expresión algorítmica de las siguientes expresiones: ");
        System.out.println("((A*A)/(B-C) + (- 1/F * (D-E/)G*H/J))");
        System.out.println("(a * a + b * b * b + -4)/3*c");
        System.out.println("(3*a + b)/(c/1) - (d + 5*e/(f/1 + g/2*h))");
        System.out.println("((a+b)/c) - ((3*t)/h+j) - 7*k");
    }
}
