package Programs;
public class ScientificCalculator extends Calculator {
    public void calcTrignometry() {
    System.out.println("Trignometry " + Math.sin(45));
    System.out.println("Trignometry " + Math.cos(50));
    System.out.println("Trignometry " + Math.tan(60));
    }
    public void calcLog() {
    System.out.println("Logarithmic " + Math.log(600));
    System.out.println("Logarithmic " + Math.log(450));
    System.out.println("Logarithmic " + Math.log(500));
    }
    public void calcExponent() {
    System.out.println("Exponent " + Math.exp(5));
    System.out.println("Exponent " + Math.exp(2));
    System.out.println("Exponent " + Math.exp(1));
    }
    public void aboutme() {
    super.aboutme();
    System.out.println("I am scientific calculator");
    }
    }