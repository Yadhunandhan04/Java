package Interface;

class Ball implements Tossable
{
    private String brandName;

    public Ball(String brandName)
    {
        this.brandName=brandName;
    }
    public String getBrandName()
    {
        return brandName;
    }
    public void toss()
    {
        System.out.println("Toss Overriding in Ball");
    }
    public void Bounce()
    {
        System.out.println("Bounce Overriding in Ball");
    }
}
