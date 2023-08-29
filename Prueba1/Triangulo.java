package Prueba1;
public class Triangulo extends Figura{
  
    public Triangulo() {
        super();
    }

    public Triangulo(double x, double y) {
        super(x,y);

    }
  
    @Override
    double calcularArea() {
        
        return x*y/2;
    }
}
