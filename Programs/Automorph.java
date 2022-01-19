package Programs;
import java.util.Scanner;
public class Automorph {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt(),i=1,zero=1;
        i=n;
        while(i>0)
        {
            zero*=10;
            i/=10;
        }//Srikanth 20EUAI042
        System.out.print(n+" is ");
        if((n*n)%zero!=n)
        {
            System.out.print("Not a Automorphic");
        }
        else
        {
        System.out.print("a Automorphic");
        }
        sc.close();
    }
}
