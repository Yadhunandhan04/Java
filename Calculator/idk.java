package Calculator;
public class idk
{
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println();
        Calculator c = new Calculator(10, 20);
        c.aboutme();
        c.add();
        c.divide();
        c.subtract();
        c.multiply();
        
        System.out.println();

        ScientificCalculator sc = new ScientificCalculator(10, 20);
        sc.aboutme();
        sc.calcTrignometry();
        sc.calcLog();
        sc.calcExponent();

        System.out.println();
        
        FinancialCalculator fc = new FinancialCalculator(10, 20);
        fc.aboutme();
        fc.calcFutureValue();
        fc.calcInterest();
    }
}