package Abstract;
class Teacher extends Worker
{
    private String qualification;

    public Teacher(int id, String name, String desigantion, String organization, String qualification)
    {
        super(id, name, desigantion, organization);
        this.qualification=qualification;
    }
    public String getQualification()
    {
        return qualification;
    }
    public void setQuali(String qualification)
    {
        this.qualification=qualification;
    }
    public String Random_Stuffs()
    {
        return +getId()+getName()+getDesigantion()+getOrganization()+getQualification();
    }
}
        