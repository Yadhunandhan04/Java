
import java.util.*;
public class Set 
{
        public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<String>();
        s.add("Java");
        s.add("C");
        s.add("Python");
        s.add("Java Script");
        s.add("NodeJS");
        s.remove("Java");
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }    
}

