package permutation;

import java.util.*;
class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Student other){
        return this.id - other.id; // Natural ordering by ID (ascending)
    }
    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sort using Comparable
        Collections.sort(students);

        System.out.println("Sorted by ID (using Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}


