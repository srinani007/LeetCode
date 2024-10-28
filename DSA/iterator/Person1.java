package iterator;

import java.util.LinkedList;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }    
}

public class Person1 {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Alice", 25));
        list.add(new Person("Bob", 30));

        String s = list.getClass().toString();
        System.out.println(s);
    }
}
