package exceptions;
/**
 * Existen varios tipos de excepciones
 * como seria esta de AritmeticException ya que aqui
 * estamos trabajando con operaciones matematicas...
 * tomado de:
 * https://www.infoworld.com/article/3269036/exceptions-in-java-part-1-exception-handling-basics.html
 */

public class Try {
    public static int dividendo = 7;
    public static int divisor = 0;
    public static void main(String[] args) {
        try{
            System.out.println(dividendo/divisor);
        }catch (ArithmeticException e){
            //Se podria remplazar por un  e.getMessage()
            System.out.println(e);
        }
    }
}
