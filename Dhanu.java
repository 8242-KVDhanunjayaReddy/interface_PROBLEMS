package InterfaceP;

public class Dhanu {
    public static void main(String[] args) {
        Functionalinterface obj=(a, b)->a+b;
       int value = obj.add(5,6);
        System.out.println(value);
    }

}
