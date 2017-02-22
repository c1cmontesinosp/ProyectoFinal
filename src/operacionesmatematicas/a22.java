package operacionesmatematicas;

/**
 *
 * @author piedad
 */
   
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class a22 { 
        private  int opc=6; 
        private double pi = 3.1416;
    private double r;
    private double v1;
    private double h;
    private String o;
        public a22(){            
        }
        public  void funcion()throws IOException 
        {
            int a,b,c,v; 
            int s=0;
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            do{              
          
            while (getOpc()<1||getOpc()>5) 
            {
                    System.out.println("1. Volumen de un Paralelepipedo Rectangular");
                    System.out.println("2. Volumen de una Esfera"); 
                    System.out.println("3. Volumen de un Cilindro Recto"); 
                    System.out.println("4. Volumen de un Cono Circular Recto"); 
                    System.out.println("5. Salir");
                    System.out.println("Seleccionar su opcion: "); 
                    setOpc(Integer.parseInt(in.readLine( ))); 
            } 
            switch (getOpc()) 
            {
                case 1: System.out.println("Ingresar la base, altura y ancho: ");
                    a = Integer.parseInt(in.readLine( )); 
                    b = Integer.parseInt(in.readLine( )); 
                    c = Integer.parseInt(in.readLine( )); 
                    v=a*b*c;
                    System.out.println("El volumen es: "+v);
                    break; 
                case 2: System.out.println("Ingresar el radio: "); 
                    setR(Integer.parseInt(in.readLine( )));
                        setV1((getR() * getR() * getR()) * getPi() * (4/3)); 
                        System.out.println("El volumen es: "+getV1());
                        break; 
                case 3: System.out.println("Ingresar el radio y la altura: "); 
                      setR(Integer.parseInt(in.readLine( ))); 
                      setH(Integer.parseInt(in.readLine( )));
                      setV1(getPi() * (getR() * getR()) * getH()); 
                      System.out.println("El volumen es: "+getV1());
                      break; 
                case 4: System.out.println("Ingresar el radio y la altura: "); 
                        setR(Integer.parseInt(in.readLine( ))); 
                        setH(Integer.parseInt(in.readLine( )));
                        setV1((getPi() * (getR() * getR()) * getH()) / 3); 
                        System.out.println("El volumen es: "+getV1());break; 
            } 
        System.out.println("Deseas calcular otro volumen(s/n)?");
             setO(in.readLine());
             if((getO().compareTo("n")==0)|| getO().compareTo("N")==0)
             s=1;
             setOpc(0);
        }while(s==0);
     }

    /**
     * @return the opc
     */
    public int getOpc() {
        return opc;
    }

    /**
     * @param opc the opc to set
     */
    public void setOpc(int opc) {
        this.opc = opc;
    }

    /**
     * @return the pi
     */
    public double getPi() {
        return pi;
    }

    /**
     * @param pi the pi to set
     */
    public void setPi(double pi) {
        this.pi = pi;
    }

    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }

    /**
     * @return the v1
     */
    public double getV1() {
        return v1;
    }

    /**
     * @param v1 the v1 to set
     */
    public void setV1(double v1) {
        this.v1 = v1;
    }

    /**
     * @return the h
     */
    public double getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(double h) {
        this.h = h;
    }

    /**
     * @return the o
     */
    public String getO() {
        return o;
    }

    /**
     * @param o the o to set
     */
    public void setO(String o) {
        this.o = o;
    }
           
}
