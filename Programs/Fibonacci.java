package Programs;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int a=10; 
        int b=0;
        int n=1;
        System.out.print("Fibonacci Series of "+a+" numbers : ");
        for (int i=1; i<=a; ++i)
           {
               System.out.print(b+" ");
               int sum=b+n;
               b=n;
               n=sum;
           }

    }
}
