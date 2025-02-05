package Hashcode;

class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;  // Using 'id' as hashCode
    }
}
    

    
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(102);
    
        System.out.println(s1.id); // Output: 101
        System.out.println(s2.hashCode()); // Output: 102
    }
}
