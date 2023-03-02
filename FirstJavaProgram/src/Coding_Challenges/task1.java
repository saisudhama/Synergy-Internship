package Coding_Challenges;

import java.util.ArrayList;
import java.util.LinkedList;
// import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new LinkedList<>();
        list2.add(3);
        list3.add(5);

        //generics
        

        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.addAll(list2);
        list3.add(10);
        list3.add(11);
        list3.add(14);

        list.addAll(list3);
        list.addAll(list4);
        // System.out.println(list + " " + list2 + " " + list3);
        // list.addAll(Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        float sum = 0;
        for (int i : list) {
            sum += i;
        }

        System.out.println(sum);
        System.out.println(sum / list.size());
        // sort list in descending order
        // list.sort((a, b) -> b - a);

        // list.sort(null);

        int max =list.get(0);
        int min =list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum element is " + min + " Maximum element is " + max);

        //System.out.println("Minimum element is " + list.get(0)+ " Maximum element is " + list.get(list.size() - 1));
        System.out.println(list);

    }
    
}
