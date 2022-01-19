import java.lang.annotation.* ;
 
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface iphone {
   String os() default "ios";
   String brand() default "Apple";
   int version();
}
@iphone(version = 11)
class pro
{
   double display_size;
   int price;
   pro(double display_size , int price)
   {
       this.display_size = display_size;
       this.price = price;
       System.out.println("\nPRO\nDisplay Size :" +display_size+"\n"+"Price :"+price);
   }
}
@iphone(version=12)
class mini
{
   double display_size;
   int price;
   mini(double display_size,int price)
   {
       this.display_size = display_size;
       this.price = price;
       System.out.println("MINI\nDisplay Size : "+display_size+"\nPrice : "+price);
   }
}
@iphone(version = 13)
class promax{
   double display_size;
   int price;
   promax(double display_size,int price)
   {
       this.display_size = display_size;
       this.price = price;
       System.out.println("PRO MAX\nDisplay Size : "+display_size+"\nPrice : "+price);
   }
}
public class Example
{
   public static void main(String args[])
   {   
       pro p1 = new pro(6.5,85000);
       Class p2 = p1.getClass();
       Annotation p3 = p2.getAnnotation(iphone.class);
       iphone p4 = (iphone)p3;
       System.out.println("Version : "+p4.version()+"\n");
 
       mini m1 = new mini(5.5,70000);
       Class m2 = m1.getClass();
       Annotation m3 = m2.getAnnotation(iphone.class);
       iphone m4 = (iphone) m3;
       System.out.println("Version : "+m4.version()+"\n");
 
       promax pr1 = new promax(7.5,105000);
       Class pr2 = pr1.getClass();
       Annotation pr3 = pr2.getAnnotation(iphone.class);
       iphone pr4 = (iphone)pr3;
       System.out.println("Version : "+pr4.version()+"\n");
   }
}