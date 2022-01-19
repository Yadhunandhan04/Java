package Number;

public class Palindrome 
{
    int n;
    Palindrome(int num)
    {
        this.n=num;
    }
    public void Program()
    {
        int temp=n,sum=0,r=0;
        while(n>0)
        { 
            r=n%10; 
            sum=(sum*10)+r; 
            n=n/10; 
        } 
        if(temp==sum)
        {
            System.out.println(temp+" is a palindrome number ");    
        } 
        else
        {
            System.out.println(temp+" is not a palindrome number"); 
        }       
    }
}
