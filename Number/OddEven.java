package Number;

public class OddEven 
{
        int num;
        OddEven(int n)
        {
        this.num=n;
        }
        public void Program()
        {
            if(num%2==0)
            {
              System.out.println(num+" is Even");
            }
            else
            {
              System.out.println(num+" is Odd");
            }
        }
}
