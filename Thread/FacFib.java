public class FacFib 
{
    public static void main(String [] args) 
    {
        FibThread t1 = new FThread(25); 
        FThread t2 = new FThread(30); 
        t1.start();
        t2.start();
    }
}
