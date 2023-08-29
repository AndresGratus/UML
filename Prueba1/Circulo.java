package Prueba1;
public class Circulo extends Figura{


    private double RADIO;

    public Circulo() {
        super();
    }

    public Circulo(double radio, double x, double y) {
        super(x,y);
        this.RADIO = radio;
    }
 @Override
 double calcularArea() {
     double pi = 3.14;
     return  pi * RADIO * RADIO;
 }   


}
