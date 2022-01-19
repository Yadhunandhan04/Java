public class Main{
    public static void main(String args[]){
       
        Pro p1 = new Pro(6.5,85000);
        Class p2 = p1.getClass();
        Annotation p3 = p2.getAnnotation(iphone.class);
        iphone p4 = (iphone)p3;
        System.out.println("Version : "+p4.version()+"\n");
  
        Mini m1 = new Mini(5.5,70000);
        Class m2 = m1.getClass();
        Annotation m3 = m2.getAnnotation(iphone.class);
        iphone m4 = (iphone) m3;
        System.out.println("Version : "+m4.version()+"\n");
  
        ProMax pr1 = new ProMax(7.5,105000);
        Class pr2 = pr1.getClass();
        Annotation pr3 = pr2.getAnnotation(iphone.class);
        iphone pr4 = (iphone)pr3;
        System.out.println("Version : "+pr4.version()+"\n");
    }
 }