package InterfaceP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduce {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Integer reduce = list.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum);
        Integer reduce = list.stream().filter(num -> num % 2 == 0).map(n->n*n).reduce(0,(A,B)->A+B);
        System.out.println(reduce);

    }

}
