
package Punto1;

public class Coche {
    //Atributos
    String color;
    String marca;
    String modelo;
    int numCaballos;
    int numPuertas;
    String matricula;
    
    //Metodo constructor
    public Coche(String color, String marca, String modelo, int numCaballos, int numPuertas, String matricula){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.numCaballos = numCaballos;
        this.numPuertas = numPuertas;
        this.matricula = matricula;
    }
    
    //Metodo
    public void mostrarDatos(){
        System.out.println("\n-----DATOS DEL COCHE:-----");
        System.out.println("Color del coche: "+color);
        System.out.println("Marca del coche: "+marca);
        System.out.println("Modelo del coche: "+modelo);
        System.out.println("Numero de caballos del coche: "+numCaballos);
        System.out.println("Numero de puertas del coche: "+numPuertas);
        System.out.println("Matricula del coche: "+matricula);
    }
}
