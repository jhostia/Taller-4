
package Punto2;

import javax.swing.JOptionPane;

public class Cuenta {
    int noCuenta;
    String nombreCliente;
    double saldo;
    double monto;
    char consignar, retirar;
    

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void consignar(){
        consignar = JOptionPane.showInputDialog("Desea consignar? [S/N]").charAt(0);
        if(consignar == 'S' || consignar == 's'){
            this.monto = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a consinar: "));
            JOptionPane.showMessageDialog(null, "Monto consignado exitosamente");
            JOptionPane.showMessageDialog(null, "Saldo total: "+(saldo+monto));
        } 
        JOptionPane.showMessageDialog(null, "Gracias!");
    }
    
    public void retirar(){
        retirar = JOptionPane.showInputDialog("Desea retirar? [S/N]").charAt(0);
        if(retirar == 'S' || retirar == 's'){
            this.monto = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a retirar: "));
            JOptionPane.showMessageDialog(null, "Monto retirado exitosamente");
            JOptionPane.showMessageDialog(null, "Saldo restante: "+(saldo-monto));
        }
         JOptionPane.showMessageDialog(null, "Gracias!");
    }
}

