package Programs;
import java.util.Scanner;
public class Multiplication
{
    public static void main(String[] args) {
        int n1,n2,n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n1 = in.nextInt();
        System.out.println("Enter a number : ");
        n2 = in.nextInt();
        n = n1*n2;
        System.out.println("Multiplication = "+n);
        in.close();
    }
}