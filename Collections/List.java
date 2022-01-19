
import java.util.*;

public class List
{
    public static void main(String[] args) 
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("India");
        al.add("Canada");
        al.add("italy");
        al.add("China");
        al.add("Singapore");
        al.remove("Canada");
        Iterator<String> it = al.iterator();
        while (it.hasNext()) 
        {
            System.out.println(it.next());
        }
    }
}
