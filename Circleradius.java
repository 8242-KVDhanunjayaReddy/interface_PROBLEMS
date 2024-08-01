package InterfaceP;

import java.util.function.Function;

public class Circleradius {
        public static  void main(String[] args) {
            Function<Double, Double> calculateArea = radius -> 3.14 * radius * radius;
            double radius = 10;
         //   double area = calculateArea.apply(radius);
            System.out.println("The area of the circle with radius " + radius + " is " + calculateArea.apply(radius));
        }
    }
