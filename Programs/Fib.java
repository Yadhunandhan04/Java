package Programs;
import java.util.Scanner;
public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a postion : ");
        int n=sc.nextInt()-1,fib;
        //Srikanth 20EUAI042
        fib=(int)((Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
        System.out.print("Fibonicc number of "+(n+1)+" th term is: "+fib);
        sc.close();
    }
}
