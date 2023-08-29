package Records;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {

        List<String> lista =  Arrays.asList("Andres","Felipe");
        List<String> lista2 = Arrays.asList("a", "b", "c");

        List<List<String>> listasdelistas = new ArrayList<>();

        listasdelistas.add(lista);
        listasdelistas.add(lista2);

        Persona per1 = new Persona("Andres", 1,listasdelistas);

        // System.out.println(per1.equals(new Persona("Andres Felipe",12)));
        System.out.println(per1.toString());
        
    }
}
