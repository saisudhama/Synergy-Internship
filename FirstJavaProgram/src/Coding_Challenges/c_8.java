package Coding_Challenges;

import java.util.HashMap;
import java.util.Map;

public class c_8 {
    public static void main(String[] args) {
        String s = "aaaabbbccccaaeeekkkvvvvv";
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i=0;i<s.length();i++)
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i), 1);

       /*  Map<Character, Integer> result = new HashMap<>();
        
        for (Map.Entry<Character, Integer> m : map.entrySet())
            if (!(m.getValue() % 2 == 0))
                // map.remove(m.getKey());
                result.put(m.getKey(), m.getValue());
        
        System.out.println(map + " " + result);

        String resultString = "";
        for (Map.Entry<Character, Integer> m : result.entrySet())
            resultString += ("" + m.getKey()).repeat(m.getValue());
        
        System.out.println(resultString); */

        for (Map.Entry<Character, Integer> m : map.entrySet())
            if ((Integer)m.getValue() % 2 == 0)
                s = s.replaceAll("" + m.getKey(), "");
        
        System.out.println(s);

    }
}
