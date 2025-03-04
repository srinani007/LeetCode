package inHertence;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
    
}

public class Dog extends Animal {
    
   
    public Dog(Object object) {
                // Constructor implementation
            }
        void bark() {
            System.out.println("The dog barks.");
        }
        public static void main(String[] args) {
            Dog myDog = new Dog(null);
        myDog.eat();
        myDog.bark();
        
    }
    
}

