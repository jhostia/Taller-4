
package Punto4;

public class Habitacion {
    //Atributos
    float altura;
    float ancho;
    float largo;
    float metros;
    float paredes;
    
    //Metodo constructor
    public Habitacion(float altura, float ancho, float largo){
        this.altura = altura;
        this.ancho = ancho;
        this.largo = largo;
    }
    
    //Metodos
    public void calcularPiso(){
        metros = ancho * largo;
    }
    
    public void calcularParedes(){
        paredes = (ancho * largo) * altura;
    }
}
