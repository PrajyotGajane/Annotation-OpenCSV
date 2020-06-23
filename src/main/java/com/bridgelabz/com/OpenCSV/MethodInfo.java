package com.bridgelabz.com.OpenCSV;
import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
      String author() default "Prajyot";
      String date();
      int revision() default 1;
      String comment();
}
