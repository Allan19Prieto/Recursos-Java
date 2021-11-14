package exceptions;

/**
 * Esta variante, nos va apermitir lanzar una
 * excepcion propia
 * tomado de:
 * https://www.infoworld.com/article/3269036/exceptions-in-java-part-1-exception-handling-basics.html
 */

public class Throw {
    public static int dividendo = 7;
    public static int divisor = 0;

    public static void main(String[] args){
        dividir();
    }

    public static void dividir(){
        try {
            if(divisor == 0){
                throw new IllegalArgumentException("No se puede divider por cero");
            }else {
                System.out.println(dividendo/divisor);
            }

        }catch (IllegalArgumentException e){
            //Podriamos poner e.getMessage()
            System.err.println(e);
        }
    }
}
