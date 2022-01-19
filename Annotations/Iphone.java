import java.lang.annotation.* ;
 
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface iphone {
   String os() default "ios";
   String brand() default "Apple";
   int version();
}
@iphone(version = 11)
