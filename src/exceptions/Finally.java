package exceptions;

/**
 * Consiste en capturar una excepcion,eminitr un mensaje de error
 * cierra los recursos y la aplicacion finaliza en ese monento
 * tomado de:
 * https://www.arquitecturajava.com/java-finally-y-el-cierre-de-recursos/
 */

public class Finally {
    public static int divdenso = 7;
    public static int divisor = 0;
    public static void main(String[] args){
        try {
            System.out.println(divdenso/divisor);
        }catch (Exception e){ //El Exception e captura todo tipo de excepcions
            System.out.println("Fallo la operacion");
        }finally {
            System.out.println("Cerrando los recuros");
        }
        System.out.println("Finalizo!!");
    }
}
