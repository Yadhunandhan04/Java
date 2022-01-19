package Programs;
import java.util.Scanner;
public class Solution
{
    public static void main(String args[])
    {
        int x,i,y=2;
        int z=0;
        Scanner obj = new Scanner(System.in);
        x = obj.nextInt();
        obj.close();
        int a[] = new int[x];
        for(i=0;i<x;i++)
        {
            a[i] = obj.nextInt();
        }
        y=Solu(a,x);
        z=Solu(a,x);
        if(z*y==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(z*y);
        }
    }
    
    public static int Solu(int a[], int x)
    {
        int i,j,k=2;
        for(i=0;i<x;i++)
        {
            for(j=0;j<x;j++)
            {
                if(a[i]==a[j])
                {
                    k--;
                }
                if(k==0)
                {
                    break;
                }
                if(j==x-1)
                {
                    a[i]=0;
                }
            }
            k=2;
        }
        k=a[0];
        for(i=0;i<x;i++)
        {
            if(a[i]>k)
            {
                k=a[i];
            }
        }
        j=0;
        for(i=0;j<2;i++)
        {
            if(k==a[i])
            {
                a[i]=0;
                j++;
            }
        }
        return k;
    }
}