package reflection;
import reflection.pojo.*;
import java.lang.reflect.*;

public class Main {
  public static void main(String[] args) {
   // Class obj = Prueba.class;
    try {
      Class prueba = Class.forName("reflection.pojo.*");
      Constructor[] constructors = prueba.getConstructors();
      int i = 0;
      for (Constructor constructor : constructors) {
        System.out.println("La clase tiene (" + i + ")");
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }


  }
}
