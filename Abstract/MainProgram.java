package Abstract;
class MainProgram 
{
    public static void main(String[] args) 
    {
       Teacher Tr = new Teacher(101, "Ashok", "Teacher", "PPK", "B.Ed,.");
       Doctor Do = new Doctor(201, "Alex", "Doctor", "PPK", "M.B.B.S,.");
       Driver Dr = new Driver(301, "Abdul", "Driver", "PPK", "Yes");

       System.out.println("Teacher");
       System.out.println("Id            : "+Tr.getId());
       System.out.println("Name          : "+Tr.getName());
       System.out.println("Designation   : "+Tr.getDesigantion());
       System.out.println("Organization  : "+Tr.getOrganization());
       System.out.println("Qualification : "+Tr.getQualification());

       System.out.println();
       
       System.out.println("Doctor");
       System.out.println("Id            : "+Do.getId());
       System.out.println("Name          : "+Do.getName());
       System.out.println("Designation   : "+Do.getDesigantion());
       System.out.println("Organization  : "+Do.getOrganization());
       System.out.println("Specalist     : "+Do.getSpecialist());

       System.out.println();
       
       System.out.println("Driver");
       System.out.println("Id            : "+Dr.getId());
       System.out.println("Name          : "+Dr.getName());
       System.out.println("Designation   : "+Dr.getDesigantion());
       System.out.println("Organization  : "+Dr.getOrganization());
       System.out.println("Licensed      : "+Dr.getLicensed());

       System.out.println();
       System.out.println("Program By brendu  bunda");
       System.out.println();
    }
}
