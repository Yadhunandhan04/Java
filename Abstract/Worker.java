package Abstract;
abstract class Worker
{
    private int id;
    private String name;
    private String desigantion;
    private String organization;

    public Worker(int id, String name, String desigantion, String organization)
    {
        this.id=id;
        this.name=name;
        this.desigantion=desigantion;
        this.organization=organization;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getDesigantion()
    {
        return desigantion;
    }
    public void setDesigantion(String desigantion)
    {
        this.desigantion=desigantion;
    }
    public String getOrganization()
    {
        return organization;
    }
    public void setOrganization(String organization)
    {
        this.organization=organization;
    }
    public abstract String Random_Stuffs();
}
