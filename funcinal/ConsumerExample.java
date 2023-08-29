package funcinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample{
 public static void main(String[] args) {
      List<Double> values = Arrays.asList(20.5,100d,26d,50.5,400d);
      ArrayList<Integer> numeros = new ArrayList<>();
      numeros.add(12);
      numeros.add(5);
      numeros.add(6);
      numeros.add(56);
      numeros.add(78);
      numeros.add(10);
      
      Consumer<Integer> recorridoEnteros = x -> {System.out.println(x);};
      numeros.forEach(recorridoEnteros);

      

      String saludo  = "Hola";
      
      Consumer<List<Double>> sqrtConsumer = list -> {
        for (int i = 0; i < list.size(); i++) {
          list.set(i, Math.sqrt(list.get(i)));
        }
      };

      Consumer <List<Double>> printingConsumer = list -> list.stream().forEach(System.out::println);
      Consumer <String> addName = x -> System.out.println(x + " Andres");
      //addName.accept(saludo);
      //sqrtConsumer.andThen(printingConsumer).accept(values);



 }
}