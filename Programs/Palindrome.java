package Programs;
import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       int num=in.nextInt();
       int r,sum=0;
       int temp=num; 
       in.close();   
       while(num>0)
       {    
       r=num%10;    
       sum=(sum*10)+r;    
       num=num/10;    
       }    
        if(temp==sum)    
        System.out.println("The entered number "+temp+" is a palindrome number ");    
        else    
        System.out.println("The entered number "+temp+" is not a palindrome");    
  }  
}

