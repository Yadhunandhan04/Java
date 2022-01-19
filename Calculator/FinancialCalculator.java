    package Calculator;
class FinancialCalculator extends Calculator
{
    public FinancialCalculator(double num1, double num2) 
    {
        super(num1,num2);
    }
    public void calcFutureValue()
    {
        double futureValue;
        futureValue = 3002.4;
        System.out.println("Future value : "+futureValue);
    }
    public void calcInterest()
    {
        double interest;
        interest = 34.33;
        System.out.println("Interest : "+interest);
    }
    public void aboutme()
    {
        System.out.println("I am Financial Calculator");
    }
}