package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
   private static final long serialVersionUID = 1L;
   private String name;

   public String getName() {
      return name;
   }

   Person(String name) {
      this.name = name;
   }
}

public class SerializationExample {
   public static void main(String[] args) throws Exception {
      Person person = new Person("John Doe");

      ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("person.ser"));
      oss.writeObject(person);
      oss.close();

      try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
         Person deserializedPerson = (Person) ois.readObject();
         System.out.println("Deserialized Person: " + deserializedPerson.getName());
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }

   }
}
