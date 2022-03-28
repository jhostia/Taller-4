
package Punto4;

public class PruebaHabitacion {
    public static void main(String [] args){
        Habitacion habitacion = new Habitacion(4.2f, 3.6f, 3.6f);
        
        System.out.println("-----Dimensiones de la habitacion-----");
        System.out.println("Altura de la habitacion: "+habitacion.altura+" metros");
        System.out.println("Ancho de la habitacion: "+habitacion.ancho+" metros");
        System.out.println("Largo de la habitacion: "+habitacion.largo+" metros");
        
        habitacion.calcularPiso();
        habitacion.calcularParedes();
        
        System.out.println("\nCantidad de m² que se requieren para el enchape del piso: "+habitacion.metros+" m²");
        System.out.println("Cantidad de m² de papel que se necesitan para tapizar las paredes: "+habitacion.paredes+" m²");
    }
}
