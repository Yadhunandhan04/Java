package Programs;
import java.util.Scanner;
public class Fact {
  public static void main(String[] args) {
    System.out.println("Enter a num : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), i=1, f=n, Fact=1;
    while(i>=1)
    {
      Fact=Fact*i--;
    }
    System.out.println("Factorial of "+n+" is "+f);
    sc.close();
  }
}