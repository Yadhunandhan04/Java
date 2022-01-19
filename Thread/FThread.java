public class FThread extends Thread 
{
    int num, fact = 1;
    FThread(int num) 
    {
        this.num = num;
    }
    public void run()
    {
        for (int i = 1; i <= num; i++) 
        { 
            fact *= i;
        }
        System.out.println("The factorial of the number " + num + " is " + fact);
    }
}
