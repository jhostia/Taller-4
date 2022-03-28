
package Punto6;

import javax.swing.JOptionPane;

public class PruebaEcuacion {
    public static void main(String[] args) {       
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(8, 5, 7);
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x: "));
        
        ecuacion.mostrarResult(8, 5, 7, x);
        System.out.printf("Y(%d) = %.2f%n", x, ecuacion.evaluacion(x));             
    }
}
