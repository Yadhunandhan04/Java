package Dress;
public class Dress
{
    private String color;
    private String material;
    private double cost;
    public Dress(String color,String material,double cost)
    {
        this.color=color;
        this.material=material;
        this.cost=cost;
    }
    public String getColor() 
    {
        return color;
    }
    public void setColor(String color) 
    {
        this.color=color;
    }
    public String getMaterial() 
    {
        return material;
    }
    public void setMaterial(String material) 
    {
        this.material=material;
    }
    public double getCost() 
    {
        return cost;
    }
    public void setCost(double cost) 
    {
        this.cost=cost;
    }
    public String toString() 
    {
        return color+material+cost;
    }
}