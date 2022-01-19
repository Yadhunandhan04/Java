package Programs;
public class CalculatorDemo {
    public static void main(String[] args) {
    System.out.println("FINANCIAL CALCULATOR");
    FinancialCalculator fc = new FinancialCalculator();
    fc.calcFutureValue();
    fc.calcInterest();
    fc.aboutme();
    System.out.println();
    System.out.println("SCIENTIFIC CALCULATOR");
    ScientificCalculator sc = new ScientificCalculator();
    sc.calcTrignometry();
    sc.calcLog();
    sc.calcExponent();
    sc.aboutme();
    System.out.println();
    System.out.print("Sharves 20EUI037");
    }
}