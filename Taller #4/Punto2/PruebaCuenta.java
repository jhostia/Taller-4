
package Punto2;

import javax.swing.JOptionPane;

public class PruebaCuenta {
    public static void main(String [] args){
        Cuenta persona = new Cuenta();
        
        persona.setNoCuenta(Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de cuenta: ")));
        persona.setNombreCliente(JOptionPane.showInputDialog("Escriba su nombre: "));
        persona.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite su saldo: ")));
        
        persona.consignar();
        persona.retirar();
    }
}

