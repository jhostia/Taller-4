
package Punto5;

public class PruebaTriangulo {
    public static void main(String [] args){
        TrianguloIsoceles triangulo = new TrianguloIsoceles(8, 5, 65);
        triangulo.setBase(5);
        triangulo.setAltura(10);
        
        triangulo.calcularArea();
        triangulo.CalcularLongitud();
        triangulo.calcularPer();
        triangulo.calcularAnguloVer();
    }
}
