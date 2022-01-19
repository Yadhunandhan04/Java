package Interface;

class Baseball extends Ball
{
    public Baseball(String brandName)
    {
        super(brandName);
    }
    public void toss()
    {
        System.out.println("Toss in Baseball");
    }
    public void Bounce()
    {
        System.out.println("Baseball Bounced");
    }
}
