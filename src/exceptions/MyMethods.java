package exceptions;

/**
 * Se crean cuando queremos manejar excepciones no contempladas por la libreria estandar de java
 * tomado de:
 * http://puntocomnoesunlenguaje.blogspot.com/2014/04/java-excepciones.html
 * http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/excepciones/propias.htm
 */

public class MyMethods {
    public static void main(String[] args){
        String str1="120";
        String str2="3";
        String respuesta;
        int numerador, denominador, cociente;
        try{
            numerador=Integer.parseInt(str1);
            denominador=Integer.parseInt(str2);
            rango(numerador, denominador);
            cociente=numerador/denominador;
            respuesta=String.valueOf(cociente);
        }catch(NumberFormatException ex){
            respuesta="Se han introducido caracteres no numéricos";
        }catch(ArithmeticException ex){
            respuesta="División entre cero";
        }catch(ExcepcionIntervalo ex){
            respuesta=ex.getMessage();
        }
        System.out.println(respuesta);
    }

    /**
     * Metodo que lanza la excepcion
     */
    static void rango(int num, int den)throws ExcepcionIntervalo{
        if((num>100)||(den<-5)){
            throw new ExcepcionIntervalo("Numero fuera del intervalo");
        }
    }
}

/**
 * Clase que describe la excepcion
 * Tenemos qeu definir una clase ExcepcionIntervalo
 * deribada de la clase Exception
 */
class ExcepcionIntervalo extends  Exception {
    public ExcepcionIntervalo(String msg) {
        super(msg);
    }
}
