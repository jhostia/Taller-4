
package Punto3;

import javax.swing.JOptionPane;

public class Informe {
    //Atributos
    double[] ventas = new double[13]; 
    float prom;
    double may = 0; 
    double men = 0;
    double total;
    
    //Metodo constructor
    public Informe(float prom, double total) {
        this.prom = prom;
        this.total = total;
    }
    
    //Setter y Getter
    public float getProm() {
        return prom;
    }

    public void setProm(float prom) {
        this.prom = prom;
    }

    public double getMay() {
        return may;
    }

    public void setMay(double may) {
        this.may = may;
    }

    public double getMen() {
        return men;
    }

    public void setMen(double men) {
        this.men = men;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //Metodos
    public void ingresarVentas(){
            ventas[0] = 230000.00;
            ventas[1] = 300000.00;
            ventas[2] = 500000.00;
            ventas[3] = 150000.00;
            ventas[4] = 600000.00;
            ventas[5] = 895000.00;
            ventas[6] = 234567.00;
            ventas[7] = 180000.00;
            ventas[8] = 200000.00;
            ventas[9] = 175000.00;
            ventas[10] = 123000.00;
            ventas[11] = 450000.00;
    }
    
    public void promedio(){
        for(int i = 0; i < 12; i++){
            prom += ventas[i];
        }
        prom /= 12;
        JOptionPane.showMessageDialog(null,"El promedio total de ventas es de: "+prom);
    }
    
    public void mayor(){
        for(int x = 0; x < 12; x++){
            if(ventas[x] > may){
                may = ventas[x];
            }
        }
        JOptionPane.showMessageDialog(null,"La mayor venta del año es: "+may+" pesos.");
    }
    
    public void menor(){
        for(int y = 0; y < 12; y++){
            if(ventas[y] < men){
                men = ventas[y];
            }
        }
        JOptionPane.showMessageDialog(null,"La menor venta del año es de: "+men+" pesos.");
    }
    
    public void sumatoria(){
        for(int j = 0; j < 12; j++){
            total += ventas[j];
        }
        JOptionPane.showMessageDialog(null,"El acumulado de ventas del año es de: "+total+" pesos");
    }
}

