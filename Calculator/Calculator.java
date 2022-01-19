package Calculator;
public class Calculator
{
    private double num1;
    private double num2;

    Calculator(double num1, double num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    public void setNum1(double num1)
    {
        this.num1=num1;
    } 
    public void setNum2(double num2)
    {
        this.num2=num2;
    }
    public void add()
    {
        System.out.println("Addition : "+num1+"+"+num2+"="+(num1+num2));
    }
    public void subtract()
    {
        System.out.println("Subtraction : "+num1+"-"+num2+"="+(num1-num2));
    }
    public void multiply()
    {
        System.out.println("Multiplication : "+num1+"x"+num2+"="+(num1*num2));
    }
    public void divide()
    {
         System.out.println("Division : "+num1+"/"+num2+"="+(num1/num2));
    }
    public void aboutme()
    {
         System.out.println("Iam Calculator");
    }
}