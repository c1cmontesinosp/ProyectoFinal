package operacionesmatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author piedad
 */
public class Ecuacion2g {
        private static double a;               // Coeficiente de grado 2
        private static double b;               // Coeficiente de grado 1
        private static double c;               // Coeficiente de grado 0

    /**
     * @return the a
     */
    public static double getA() {
        return a;
    }

    /**
     * @param aA the a to set
     */
    public static void setA(double aA) {
        a = aA;
    }

    /**
     * @return the b
     */
    public static double getB() {
        return b;
    }

    /**
     * @param aB the b to set
     */
    public static void setB(double aB) {
        b = aB;
    }

    /**
     * @return the c
     */
    public static double getC() {
        return c;
    }

    /**
     * @param aC the c to set
     */
    public static void setC(double aC) {
        c = aC;
    }
        
        public Ecuacion2g(){
               a=0.0;
               b=0.0;
               c=0.0;
        }
    public  void funcion () throws IOException {
       
        double discriminante2;   // Discriminante
        double x1;              // Primera raiz real
        double x2;              // Segunda raiz real
        double preal;           // Parte real de la raiz compleja
        double pimag;           // Parte imaginaria de la raiz compleja
         BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));   
        System.out.println("Introduce el coeficiente a de la ecuación:");
        setA(Double.parseDouble(lector.readLine()));
        System.out.println("Introduce el coeficiente b de la ecuación:");
        setB(Double.parseDouble(lector.readLine()));
         System.out.println("Introduce el coeficiente c de la ecuación:");
        setC(Double.parseDouble(lector.readLine()));
        discriminante2 = getB()*getB() -  4*getA()*getC();
        if (discriminante2>0) {
      // Dos raices reales
             x1 = (-getB() + Math.sqrt(discriminante2))/(2*getA());
            x2 = (-getB()- Math.sqrt(discriminante2))/(2*getA());
            System.out.print("Soluciones de la ecuacion de segundo grado: ");
            System.out.println(getA() + "x2 + " + getB() + "x + " + getC());
            System.out.println("Tiene dos raices reales");
            System.out.println("La primera raiz es x1 = " + x1);
            System.out.println("La segunda raiz es x2 = " + x2);
        }
        else if (discriminante2<0) {
// Dos raices imaginarias
        preal = (-getB())/(2*getA());
        pimag = Math.sqrt(-discriminante2)/(2*getA());
        System.out.print("Soluciones de la ecuacion de segundo grado: ");
        System.out.println(getA() + "x2 + " + getB() + "x + " + getC());
        System.out.println("Tiene dos raices complejas");
        System.out.println("La primera raiz es x1 = " + preal + "+i" + pimag);
        System.out.println("La segunda raiz es x2 = " + preal + "-i" + pimag);
        }
    else {
     // Dos raices iguales
        x1 = (-getB())/(2*getA());
        System.out.print("Soluciones de la ecuacion de segundo grado: ");
        System.out.println(getA() + "x2 + " + getB() + "x + " + getC());
        System.out.println("Dos raices identicas, x1 = x2 = " + x1);
        }
   
    }
   
}

