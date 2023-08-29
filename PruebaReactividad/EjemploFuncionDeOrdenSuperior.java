package PruebaReactividad;

import java.util.function.Function;

public class EjemploFuncionDeOrdenSuperior {

   public static void main(String[] args) {
      Function<Integer, Integer> funcionCuadrado = (numero) -> numero * numero;
      int resultado = aplicarFuncion(funcionCuadrado, 5);
      System.out.println("El resultado es: " + resultado);
   }

   public static int aplicarFuncion(Function<Integer, Integer> funcion, int numero) {
      return funcion.apply(numero);
   }
}
