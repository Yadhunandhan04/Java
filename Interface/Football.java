package Interface;

class Football extends Ball
{
    public Football(String brandName)
    {
        super(brandName);
    }
    public void toss()
    {
        System.out.println("Toss in Football");
    }
    public void Bounce()
    {
        System.out.println("Football Bounced");
    }
}
