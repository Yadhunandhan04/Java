import java.sql.*;

public class Insert 
{
    public static void main(String[] args) 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?characterException=latin1","root","Yadhuu*29");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO MovieDetails VALUES (101, 'The Lost World', 'Steven Spielberg', 1997, 'sci-fi')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MovieDetails VALUES (102, 'Pirates of the Caribbean', 'Gore Verbinski', 2003, 'fantasy')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MovieDetails VALUES (103, 'Harry Potter and Goblet of Fire', 'Mike Newell', 2005, 'fantasy')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MovieDetails VALUES(107, 'Inception', 'Christopher Nolan', 2010, 'sci-fi')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MovieDetails VALUES(108, 'Thor', 'Kenneth Branagh', 2011, 'fantasy')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MovieDetails VALUES(109, 'Epic', 'Chris Wedge', 2013, 'adventure');";
            stmt.executeUpdate(sql);
            con.close();
        }
        catch(ClassNotFoundException e) 
        {
            System.out.println("Java Exception "+e);
        }
        catch(SQLException e)
        {
            System.out.println("SQL Exception "+e);
        }

    }
}
