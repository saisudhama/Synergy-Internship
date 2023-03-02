package Coding_Challenges;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class c_7 {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>();
        HashSet<String> h2 = new HashSet<>();
        HashSet<String> h3 = new HashSet<>();
        // HashSet<String> result = new HashSet<>(h1);

        h1.addAll(List.of("a", "b", "c", "d", "e"));
        h2.addAll(List.of("f", "g", "h", "e", "k", "a"));
        h3.addAll(List.of("a", "e", "h", "k", "c"));

        HashSet<String> result = new HashSet<>(h1);

        // result.addAll(h1);
        result.retainAll(h2);
        result.retainAll(h3);

        System.out.println(result);

        String s = "Hello";
        System.out.println(s.substring(0, 2).toUpperCase() + s.substring(2).toLowerCase());

        TreeSet<String> sortedAlphabets = new TreeSet<>();
        sortedAlphabets.addAll(List.of("a", "e", "h", "k", "c"));

        System.out.println(sortedAlphabets);

    }
}
