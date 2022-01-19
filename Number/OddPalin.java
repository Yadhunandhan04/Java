package Number;
import java.util.Scanner;

public class OddPalin 
{
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println("Program by Yadhunandhan");
        System.out.println();
        Scanner obj = new Scanner(System.in);
        System.out.println("Odd Even Function");
        System.out.print("Enter to check the number is Odd or Even : ");
        int x = obj.nextInt();
        OddEven oe = new OddEven(x);
        oe.Program();
        System.out.println();
        System.out.println("Palindrome Function");
        System.out.print("Enter to check the number is Palindrom or Not : ");
        int y = obj.nextInt();
        Palindrome pa = new Palindrome(y);
        pa.Program();
        System.out.println();
        obj.close();
    }
}