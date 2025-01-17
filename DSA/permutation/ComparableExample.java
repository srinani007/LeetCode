package permutation;

class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student other){
        return this.id - other.id; // Natural ordering by ID (ascending)
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    
    
}

public class ComparableExample {
    public static void main(String[] args) {
        
    }
}


