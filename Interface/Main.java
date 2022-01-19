package Interface;
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println();

        System.out.println("Rock");
        Rock obj = new Rock();
        obj.toss();

        System.out.println();
        
        System.out.println("Ball");
        Ball obj1 = new Ball("Adidas");
        System.out.println("Ball Brandname : "+obj1.getBrandName());
        obj1.toss();
        obj1.Bounce();

        System.out.println();

        System.out.println("Baseball");
        Ball obj2 = new Baseball("Rebok");
        System.out.println("Baseball Brandname : "+obj2.getBrandName());
        obj2.toss();
        obj2.Bounce();

        System.out.println();

        System.out.println("Football");
        Ball obj3 = new Football("Puma");
        System.out.println("Football Brandname : "+obj3.getBrandName());
        obj3.toss();
        obj3.Bounce();

        System.out.println();
        System.out.println("Program By brendu bunda");
        System.out.println();
        System.out.println("It tends to the ");
        System.out.println("This code was made to pretend the exchale performance by the user interfae for the database aka jdbc");
    }
}
