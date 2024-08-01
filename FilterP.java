package InterfaceP;

import java.util.List;
import java.util.stream.Collectors;

public class FilterP {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Ajay", "Java");

       List<String> filtered = list.stream().filter(str -> str.startsWith("A")).collect(Collectors.toList());

       filtered.stream().forEach(System.out::println);
    }
}
