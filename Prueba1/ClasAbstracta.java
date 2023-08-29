package Prueba1;
public class ClasAbstracta {

    public static void main(String[] args) {

        Cuadrado obj = new Cuadrado(14,5,6);

        // System.out.println(obj.calcularArea());
        // System.out.println(obj.x);
        // System.out.println();

        Triangulo obj2 = new Triangulo(2, 5);

        System.out.println(obj2.calcularArea());
    }
}