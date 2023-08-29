package herencia;

public class Herencia {
  public static void main(String[] args) {
    
    Persona persona[] = new Persona[5];

    persona[0] = new Persona();
    persona[1] = new Empleado();

    Empleado empleado = new Empleado();
    Consultor consultor = new Consultor();

  }
}
