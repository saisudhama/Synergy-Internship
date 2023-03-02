import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sets {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();
        s1.addAll(Arrays.asList(new String[] {"A", "B", "C", "D"}));
        s2.addAll(Arrays.asList(new String[] {"C", "D", "E", "F"}));
        
        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);
        System.out.println("Union: " + union);

        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);
        System.out.println("Intersection: " + intersection);
    }
}
