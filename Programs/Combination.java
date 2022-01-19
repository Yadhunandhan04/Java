package Programs;
import java.util.Scanner;
public class Combination {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a First String : ");
       String a = sc.nextLine();
       System.out.print("Enter a Second String : ");
       String b = sc.nextLine();
       int x = (b.length());
       for(int i=0;i<=(a.length()-1);i++)
       {  //Yadhunandhan 20EUAI058
           System.out.print(a.charAt(i));
           System.out.print(b.charAt(i));
       }
       System.out.print(b.substring(a.length(),x));
       sc.close();
   }    
}
