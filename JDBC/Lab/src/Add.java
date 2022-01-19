import java.sql.*;

public class Add
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "Yadhuu*29");
            Statement smt = con.createStatement();
            String sql = "INSERT INTO MovieDetails values(110, 'Night at the Museum', 'Shawn Levy', 2006, 'comedy');";
            smt.executeUpdate(sql);
            con.close();   
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("Java Exception "+e);
        }
        catch (SQLException e)
        {
            System.out.println("Sql Exception "+e);
        }
    }
}
