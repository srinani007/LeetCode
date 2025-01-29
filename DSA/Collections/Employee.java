package Collections;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return id == other.id && ((name == null && other.name == null) || (name != null && name.equals(other.name)));
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

// ✅ `CustomObjectSet` is now OUTSIDE the `Employee` class
class CustomObjectSet {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "John"));
        employees.add(new Employee(2, "Jane"));
        employees.add(new Employee(1, "John")); // Duplicate (same ID & name)
        employees.add(new Employee(3, "Bob"));
        employees.add(new Employee(2, "Jane")); // Duplicate
        employees.add(new Employee(4, "Alice"));
        employees.add(new Employee(5, "Mike"));
        employees.add(new Employee(6, "Emma"));
        employees.add(new Employee(7, "Oliver"));

        System.out.println(employees);
    }
}