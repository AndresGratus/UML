package Prueba1;
public abstract class Figura {
    protected double x;// pos en x
    protected double y;//pos en y

    protected Figura(){

    }

    protected Figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    abstract double calcularArea();


}
