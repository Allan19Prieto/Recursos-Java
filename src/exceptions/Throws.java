package exceptions;

/**
 *Nos permite lanzar un metodo,
 * pro lo que tiene que ir declarada en un método
 * tomado de:
 * https://www.infoworld.com/article/3269036/exceptions-in-java-part-1-exception-handling-basics.html
 */

public class Throws {
    public static int dividendo = 7;
    public static int divisor = 0;
    public static void main(String[] args){
        dividir();
    }

    public static void dividir() throws ArithmeticException{
        try{
            System.out.println(dividendo/divisor);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
