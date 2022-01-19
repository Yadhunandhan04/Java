package Programs;
import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=1,fact=1;
        i=n;
        while(i>=1)
        {
            fact=fact*i--;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        sc.close();
    } 
}