package Calculator;
class ScientificCalculator extends Calculator
{
    public ScientificCalculator(double num1, double num2)
    {
        super(num1, num2);
    }
    public void calcTrignometry()
    {
       int calc_Tri;
       calc_Tri = 10;
       System.out.println("Trignometry : "+calc_Tri);
    }
    public void calcLog()
    {
        int calc_Log;
        calc_Log = 99;
        System.out.println("Log Value : "+calc_Log);
    }
    public void calcExponent()
    {
        int calc_Exponent;
        calc_Exponent = 22;
        System.out.println("Exponent : "+calc_Exponent);
    }
    public void aboutme()
    {
        System.out.println("Iam Scientific Calculator");
    }
}