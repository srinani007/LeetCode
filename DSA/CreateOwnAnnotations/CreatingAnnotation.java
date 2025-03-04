package CreateOwnAnnotations;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

import inHertence.Dog;

public class CreatingAnnotation {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        // Creating an annotation
        Cat myCat = new Cat("Felix");
        Dog myDog = new Dog("Rover");

        if(myDog.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("The class is annotated with @VeryImportant");
        } else {
            System.out.println("The class is not annotated with @VeryImportant");
        }

        for (Method method : myCat.getClass().getMethods()) {
            if(method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    try {
                        method.invoke(myCat);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                
            }
        }
        for (Field field : myCat.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(ImpString.class)) {
                Object objectValue = field.get(myCat);

                if (objectValue instanceof String stringValue) {
                   System.out.println(stringValue.toUpperCase());
                }
            }
        }
    }
}
