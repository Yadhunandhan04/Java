package Programs;
public class FinancialCalculator extends Calculator {
    public void calcFutureValue() {
   super.setNum1(100000);
   super.setNum2(35000);
   System.out.print("Future value after 1 years: ");
   super.add();
   }
   public void calcInterest() {
   super.setNum1(100000);//principal amount
   super.setNum2(0.12);//rate of interest
   System.out.print("interest amount is ");
   super.multiply() ;//simple interest for one year
   
   }
   public void aboutme() {
   super.aboutme();//invoking aboutme class of calculator class
   System.out.println("This is financial calculator");
   }
   }