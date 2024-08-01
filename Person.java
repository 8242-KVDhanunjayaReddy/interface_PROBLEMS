package InterfaceP;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
   }

    public static void main(String[] args) {
        Person person = new Person("Ajay", 45, 25000);
        Person person1 = new Person("Vijay", 34, 30000);
        Person person2 = new Person("Jay", 21, 35000);
        Person person3 = new Person("Sanjay", 40, 40000);
Person person4=new Person("Raj", 50, 45000);
List<Person> list = List.of(person, person1, person2, person3,person4);
list.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
