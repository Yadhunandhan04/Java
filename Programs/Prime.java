package Programs;
import java.util.Scanner;
public class Prime {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to check prime: ");
        int n=sc.nextInt();
        int flag=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        //Srikanth 20EUAI042
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        System.out.print(n+" is ");
        if(flag==1)
        {
            System.out.print("Not a prime number");
        }
        System.out.print("a prime number");
        sc.close();
    }
}