package Abstract;
class Driver extends Worker
{
    private String licensed;
    
    public Driver(int id, String name, String desigantion, String organization, String licensed)
    {
        super(id, name, desigantion, organization);
        this.licensed=licensed;
    }
    public String getLicensed()
    {
        return licensed;
    }
    public void setLicensed(String licensed)
    {
        this.licensed=licensed;
    }
    public String Random_Stuffs()
    {
        return getId()+getName()+getDesigantion()+getOrganization()+getLicensed();
    }
}