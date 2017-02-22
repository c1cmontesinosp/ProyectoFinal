package operacionesmatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author piedad1
 */
public class Calculadora {
     private static int a;
     private static int b;

    /**
     * @return the a
     */
    public static int getA() {
        return a;
    }

    /**
     * @param aA the a to set
     */
    public static void setA(int aA) {
        a = aA;
    }

    /**
     * @return the b
     */
    public static int getB() {
        return b;
    }

    /**
     * @param aB the b to set
     */
    public static void setB(int aB) {
        b = aB;
    }
    public Calculadora() {
            a=0;
            b=0;
    }
    public void funcion () throws IOException {
     String c; 
     
     BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Introducir primer operando");
        setA(Integer.parseInt(lector.readLine())); 
     System.out.println("Introducir segundo operando");
        setB(Integer.parseInt(lector.readLine()));
     int s=0;
     do{
      System.out.println("¿QUé operacion desea realizar?");
      System.out.println("S -Suma");
      System.out.println("R -Resta");
      System.out.println("P -Producto");
      System.out.println("D -División");
      c=lector.readLine();
    switch (c) {
       case "S": 
       case "s": System.out.println("Resultado de la suma: " + (getA()+getB())); break;
       case "R": 
       case "r": System.out.println("Resultado de la resta: " + (getA()-getB())); break;
       case "M": 
       case "m":  
       case "P": 
       case "p": System.out.println("Resultado del producto: " +  getA()*getB()); break;
       case "D": 
       case "d": System.out.println("Resultado de la division: " + getA()/getB()); break; 
       default: System.out.println("Por favor, indica la operacion correcta"); break; 
        }
    System.out.println("Deseas realizar otra operación con los mismos operandos(s/n)");
     c=lector.readLine();
     if((c.compareTo("n")==0)|| c.compareTo("N")==0)
             s=1;
     }while(s==0);
}

}

