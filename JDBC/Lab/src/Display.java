import java.sql.*;

public class Display 
{
    public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?characterException=latin1", "root", "Yadhuu*29");
            Statement smt = con.createStatement();
            String sql = " SELECT TITLE, DIRECTOR from MovieDetails "+" WHERE YEAR > 2010 ";
            ResultSet rs = smt.executeQuery(sql);
            if(rs.next())
            {
                do
                {
                    System.out.println(rs.getString(1)+","+rs.getString(2));
                }
                while(rs.next());
            }
            else
            {
                System.out.println("Table Not found!");
            }
            con.close();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}
