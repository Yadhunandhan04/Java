import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?characterEncoding=latin1 ","root","Yadhuu*29");
            Statement stmt = con.createStatement();
            String sql = "create table MovieDetails(ID INT, TITLE VARCHAR(40), DIRECTOR VARCHAR(40), YEAR INT, GENRE VARCHAR(10));";
            stmt.executeUpdate(sql);
            con.close();
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        }   
        catch(SQLException e)
        {
            System.out.println(e);   
        }
    }
}
