package Records;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public record Persona(String nombre, int edad, List<List<String>> notas) {

    public Persona(String nombre){
        this(nombre,12,new ArrayList<>());
    }
}
 