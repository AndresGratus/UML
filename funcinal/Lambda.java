package funcinal;

public class Lambda {
 public static void main(String[] args) {

    ModificacionCadena md1 = (t) -> "¡" + t +"!";
    imprimir("Java es Tremendo", md1);
    //¡Java es Tremendo!
 } 

 public static void imprimir(String texto, ModificacionCadena formato){
  String resultado = formato.ejecutar(texto);

  System.out.println(resultado);
 }
}

interface ModificacionCadena{
  abstract String ejecutar(String text);
}
