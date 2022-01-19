import java.util.Scanner;

public class StrExp 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        System.out.println("Enter Index to print Character");
        int x = sc.nextInt();
        sc.close();
        try
        {
            char chr = str.charAt(x);
            System.out.println("Character at index "+x+" is "+chr);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        } 
    }
}
