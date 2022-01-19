package Programs;
public class Date 
{
    private int[] year = new int[] {1000, 9999};
    private int[] month = new int[] {1, 12};
    private int[] day = new int[] {1, 31};

    public Date(int[] year, int[] month, int[] day)
    {
        this.year=year;
        this.day=day;
        this.month=month;
    }
    public int[] getYear()
    {
        return year;
    }
    public int[] getMonth()
    {
        return month;
    }
    public int[] getDay()
    //Srikanth 20EUAI042
    {
        return day;
    }
    public void setYear(int[] year)
    {
        this.year=year;
    }
    public void setMonth(int[] month)
    {
        this.month=month;
    }
    public void setDay(int[] day)
    {
        this.day=day;
    }
    public String toString()
    {
        return month+"/"+day+"/"+year;
    }
    public void setData(int[] year, int[] month, int[] day)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
}
