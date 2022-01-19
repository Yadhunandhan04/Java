import java.sql.*;

public class Update 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?characterException=latin1", "root", "Yadhuu*29");
            Statement smt = con.createStatement();
            String sql = "UPDATE MovieDetails SET GENRE='Animation' WHERE TITLE='Epic';";
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
