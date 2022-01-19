package Programs;
import java.util.Scanner; 
class Concatenate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First string : ");
        String a = sc.nextLine();
        System.out.print("Enter Second string : ");
        String b = sc.nextLine();
        if(a.charAt(a.length()-1)==b.charAt(0))
        System.out.print(a+b.substring(1,b.length()));
        else //Yadhunandhan 20EUAI058
        System.out.print(a+b);
        sc.close();
    } 
}
