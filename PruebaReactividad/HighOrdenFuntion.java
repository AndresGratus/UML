package PruebaReactividad;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HighOrdenFuntion {
    public static void main(String[] args) {
        List<String> nombreList = Arrays.asList("Jan","Anders","Carlos");

        List<String> nomreListMayusculas = nombreList.stream()
                                            .map(x -> x.toUpperCase())
                                            .collect(Collectors.toList());


        System.out.println(nomreListMayusculas);
    }
}
