
package Punto6;

public class EcuacionCuadratica {
    //Atributos
    int a;
    int b;
    int c;
   
    //Metodo constructor
    public EcuacionCuadratica(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
   
    //Setter y Getter
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    //Metodos
    public void mostrarResult(int a, int b, int c, int x){
        System.out.println(a+" ("+x+" ^ 2) + "+b+" "+x+" + "+c+" = 0");
    }
    public double evaluacion(int x){        
        double y = (a * Math.pow(x, 2)) + (b * x) + c;
        return y;
    }
}

