package Dress;
public class Uniform extends Dress 
{
    private String school;
    private String location;
    public Uniform(String color,String material,double cost,String school,String location)
    {
    super(color,material,cost);
    this.school=school;
    this.location=location;
    }
    public String getSchool() 
    {
        return school;
    }
    public void setSchool(String school) 
    {
        this.school=school;
    }
    public String getLocation() 
    {
        return location;
    }
    public void setLocation(String location) 
    {
        this.location = location;
    }
    public String toString() 
    {
        return getColor()+getMaterial()+getCost();
    }
}
