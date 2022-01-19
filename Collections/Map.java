import java.util.*;

public class Map 
{
    public static void main(String args[]) 
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(301, "Apple");
        hm.put(302, "Mango");
        hm.put(303, "Grapes");
        hm.put(304, "Papaya");
        System.out.println("Fruit name for key 302 is " + hm.get(302));
        hm.put(305, "Strawberry");
        System.out.println("Map has key 303           : " + hm.containsKey(303));
        System.out.println("Map contains all elements : " + hm.entrySet());
    }
}