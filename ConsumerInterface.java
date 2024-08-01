package InterfaceP;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
    List<String> list = List.of("Apple", "Ajay", "Java");
    Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
    list.forEach(consumer);
    }
}
