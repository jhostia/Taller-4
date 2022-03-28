
package Punto3;

public class PruebaInforme {
    public static void main(String [] args){
        Informe informe = new Informe(0, 0);
        
        informe.ingresarVentas();
        informe.promedio();
        informe.setMay(0);
        informe.setMen(0);
        informe.setProm(0);
        informe.setTotal(0);
        informe.mayor();
        informe.menor();
        informe.sumatoria();
    }
}
