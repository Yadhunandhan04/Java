package Programs;
public class Loan
{
    private String c_name, l_type, c_address,l_remarks;
    private double l_amount, l_duration, l_intrest;
    private int c_id, l_id, c_age;

    public Loan(String land_type, int land_length, int land_width, int sq_feet_amount)
    {
        this.l_type="Home_Loan";
        this.l_amount=sq_feet_amount*land_length*land_width;
        this.l_duration=10;
        this.l_intrest=0.5;
        this.l_remarks="Land_Type : "+land_type;

    }
    public Loan(String car_model, int car_amount)
    {
        this.l_type="Car_Loan";
        this.l_amount=car_amount;
        this.l_duration=10;
        this.l_intrest=0.5;
        this.l_remarks="Car_Model : "+car_model;
    }
    public Loan(int p_amount, String p_loan)
    {
        this.l_type="Personal_Loan";
        this.l_amount=p_amount;
        this.l_duration=10;
        this.l_intrest=0.5;
        this.l_remarks="Personal_Loan : "+p_loan;
    }
    public Loan(int j_weight, int j_amount, String j_type)
    {
        this.l_type="Jewel_Loan";
        this.l_amount=j_amount;
        this.l_duration=10;
        this.l_intrest=0.5;
        this.l_remarks="Jewel_Type : "+j_type;
    }
    public String Details(String name, int age, int loan_id, String address, int c_id)
    {
        this.c_name=name;
        this.c_age=age;
        this.c_address=address;
        this.l_id=loan_id;
        this.c_id=c_id;
    }
    public void Display()
    {
        System.out.println("Loan_Id          : "+l_id);
        System.out.println("Loan_Type        : "+l_type);
        System.out.println("Loan_Amount      : "+l_amount);
        System.out.println("Loan_Duration    : "+l_duration);
        System.out.println("Loan_Intrest     : "+l_intrest);
        System.out.println("Loan_Remarks     : "+l_remarks);
        System.out.println("Customer_Name    : "+c_name);
        System.out.println("Customer_Id      : "+c_id);
        System.out.println("Customer_Age     : "+c_age);
        System.out.println("Customer_City    : "+c_address);
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Loan l1 = new Loan("Flat",30,45,2500);
        Loan l2 = new Loan(25000,"For Education");
        Loan l3 = new Loan("Sedan",250000);
        Loan l4 = new Loan(50,22000,"Lacquer");
        l1.Details("Bob", 25, 5255845, "Bangalore", 001);
        l2.Details("Michel", 25, 7845128, "Chennai", 002);
        l3.Details("Andrew", 30, 5588442, "Delhi", 003);
        l4.Details("Stephen", 28, 4561287, "Rajasthan", 004);
        l1.Display();
        l2.Display();
        l3.Display();
        l4.Display();
    }
}//Yadhunandhan 20EUAI058

