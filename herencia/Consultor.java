package herencia;

public class Consultor extends Persona{

  String nombre_consultor;
  int num_consiltor;

  public Consultor() {
    
  }

  public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
      String nombre_consultor, int num_consiltor) {
    super(id, dni, nombre, apellido, domicilio, telefono);
    this.nombre_consultor = nombre_consultor;
    this.num_consiltor = num_consiltor;
  }

  public String getNombre_consultor() {
    return nombre_consultor;
  }

  public void setNombre_consultor(String nombre_consultor) {
    this.nombre_consultor = nombre_consultor;
  }

  public int getNum_consiltor() {
    return num_consiltor;
  }

  public void setNum_consiltor(int num_consiltor) {
    this.num_consiltor = num_consiltor;
  }




  
}
