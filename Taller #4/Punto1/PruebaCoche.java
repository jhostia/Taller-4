
package Punto1;

public class PruebaCoche {
    public static void main(String [] args){
        Coche coche1 = new Coche("Azul", "Ferrari", "La Ferrari", 1200, 2, "VAN 356");
        coche1.mostrarDatos();
        
        Coche coche2 = new Coche("Verde", "Renault", "Logan", 400, 4, "FHG 988");
        coche2.mostrarDatos();
        
        Coche coche3 = new Coche("Blanco", "Toyota", "Prado TXL", 700, 4, "ZKL 456");
        coche3.mostrarDatos();
    }
}
