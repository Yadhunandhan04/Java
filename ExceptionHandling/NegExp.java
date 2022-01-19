package ExceptionHandling;
import java.util.Scanner;

public class NegExp 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers : ");
        int n=sc.nextInt(),sum=0,square=0;
        sc.close();
        try
        {
            if(n<=0)
            {
                throw new Exception("N must be positive");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            return;
        }
        int arr[]=new int[n];
        System.out.print("Enter the integers : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
            square+=arr[i]*arr[i];
        }
        System.out.println("Average: "+sum/n);
        System.out.println("Square of average: "+square/n);
    }
}
