package Programs;
import java.util.Scanner;
public class Repetitions {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : ");
        String a = sc.nextLine();
        System.out.print("Enter Repetition : ");
        int b = sc.nextInt();
        for(int i=1;i<=b;i++)
        { //Yadhunandhan 20EUAI058
            System.out.print(a.substring(a.length()-b));
        }
        sc.close();
    }
}
