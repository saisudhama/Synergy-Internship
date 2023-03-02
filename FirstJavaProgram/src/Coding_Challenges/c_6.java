package Coding_Challenges;

import java.util.Arrays;
import java.util.LinkedList;
// import java.util.List;

public class c_6 {
    public static void main(String[] args) {
        LinkedList<String> Ninelist = new LinkedList<>();
        LinkedList<String> Tenlist = new LinkedList<>();
        LinkedList<String> Trip = new LinkedList<>();

        // List<String> list = new LinkedList<>();

        Ninelist.addAll(Arrays.asList("Ram", "Micahel", "John", "Ron"));
        Tenlist.addAll(Arrays.asList("John", "Harry", "Ferros", "Lita"));   
        
        /* for (String i : Tenlist)
            if (!Ninelist.contains(i))
                Trip.add(i);
        
        for (String i : Ninelist)
            if (!Tenlist.contains(i))
                Trip.add(i); */

        Trip.addAll(Ninelist);
        for (String i : Tenlist)
            if (!Ninelist.contains(i))
                Trip.add(i);

        System.out.println(Trip);
    }
    
}
