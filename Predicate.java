package InterfaceP;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Predicate {
    public static void main(String[] args) {
        List<String> str = asList("Apple","Ajaysdfg","Javadfgfhg");
        List<String> filtered=str.stream().filter(s->s.length()>4 && s.substring(1,2).equals("ja")).collect(Collectors.toList());
        filtered.stream().forEach(System.out::println);
    }
}
