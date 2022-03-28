package Punto5;

public class TrianguloIsoceles {
    //Atributos
    float base, altura;
    //Variables
    float ladosIguales, ladoDiferente, angulosIguales, anguloVertice, area, longitud, perimetro;
    
    //Metodo constructor
    public TrianguloIsoceles(int ladosIguales, int ladoDiferente, int angulosIguales) {
        this.ladosIguales = ladosIguales;
        this.ladoDiferente = ladoDiferente;
        this.angulosIguales = angulosIguales;
    }
    
    //Metodos Getter y Setter
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //Metodos para calcular
    public void calcularArea(){
        area = (base * altura) / 2;
        System.out.println("Area del triangulo: "+area);
    }
    
    public void CalcularLongitud(){
        longitud = ladosIguales * 2;
        System.out.println("Longitud: "+longitud);
    }
    
    public void calcularPer(){
        perimetro = (ladosIguales * 2) + ladoDiferente;
        System.out.println("Perimetro: "+perimetro);
    }

    public void calcularAnguloVer(){
        anguloVertice = (angulosIguales * 2) - 180;
        System.out.println("Angulo vertice: "+anguloVertice);
    }
}
