package Prueba1;
public class Cuadrado extends Figura{
    
    private double lado;
    
    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x,y);
        this.lado = lado;
    }
    
    @Override
    double calcularArea() {
        return lado * lado;
    }

    public void name() {

    }
}
