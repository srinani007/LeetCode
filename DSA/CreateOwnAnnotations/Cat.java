package CreateOwnAnnotations;

@VeryImportant
public class Cat {

    @ImpString
    String name;
    int age;

    public Cat(String name) {
        this.name = name;
    }

    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("Meow");
    }
    public void sleep() {
        System.out.println("Sleep");
    }
    public void eat() {
        System.out.println("Munch");
    }

}
