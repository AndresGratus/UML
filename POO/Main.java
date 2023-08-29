package POO;

public class Main {
  public static void main(String[] args) {
    
    Alumno alumno1 = new Alumno(1,"Andres","Castañeda");
    Alumno alumno2 = new Alumno();

    alumno1.mostrarNombre();
    alumno1.setNombre("Camila");
    alumno1.mostrarNombre();
    alumno1.setNombre("Omar");
    alumno1.mostrarNombre();
    
    System.out.println(alumno1.toString());
    
  }
}
