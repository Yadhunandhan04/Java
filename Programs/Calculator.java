package Programs;
public class Calculator {
    private double num1;
    private double num2;
    Calculator() {
    }
    public Calculator(double num1, double num2) {
    this.num1 = num1;
    this.num2 = num2;
    }
    public void setNum1(double num1) {
    this.num1 = num1;
    }
    public void setNum2(double num2) {
    this.num2 = num2;
    }
    public void add() {
    System.out.println(num1 + num2);
    }
    public void subtract() {
    System.out.println(num1 - num2);
    }
    
    public void multiply() {
    System.out.println(num1 * num2);
    }
    public void divide() {
    System.out.println(num1 / num2);
    }
    public void aboutme() {
    System.out.println("I am Aravind's CALCULATOR CLASS");
    }
    }