package Concept;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)// 註解的生命週期
public @interface AnnotationTest {
    int max() default 100;

    int min() default 0;
}