package CreateOwnAnnotations;

import java.lang.annotation.Retention;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface RunImmediately {

    int times() default 1;
    
}
