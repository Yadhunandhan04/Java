package Abstract;   
class Doctor extends Worker
{
    private String specialist;

    public Doctor(int id, String name, String desigantion, String organization, String specialist)
    {
        super(id, name, desigantion, organization);
        this.specialist=specialist;
    }
    public String getSpecialist()
    {
        return specialist;
    }
    public void setSpecialist(String specialist)
    {
        this.specialist=specialist;
    }
    public String Random_Stuffs()
    {
        return getId()+getName()+getDesigantion()+getOrganization()+getSpecialist();
    }
}
