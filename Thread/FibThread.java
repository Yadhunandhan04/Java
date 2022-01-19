public class FibThread extends Thread 
{
    int b = 0, a = 1, num, fib = 0;
    FibThread(int num) 
    {
        this.num = num;
    }
    public void run() 
    {
        if (num == 1||num==0) 
        {
            System.out.println("Fibonacci number is " + (num));
        }
        else 
        {
            
            for (int j = 2; j <= num; j++) 
            { 
                fib = a + b;
                b = a;
                a = fib;
            }
            System.out.println(num + " th term in fibonacci series is " +fib);
        }
    }
}