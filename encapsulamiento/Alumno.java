package encapsulamiento;

public class Alumno {
  private int id;
  private String nombre,apellido;



  public Alumno() {
  }
  

  public Alumno(int id, String nombre, String apellido) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
  }


  public void mostrarNombre(){
    System.out.println("Hola soy " + nombre);
  }

  public void Aprobado(double calificacion){
      if(calificacion >5.9){
        System.out.println("Aprobo la materia");
      } else{
        System.out.println("No aprobo");
      }
  }

  //Sett and Gette
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getApellido() {
    return apellido;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  
}
