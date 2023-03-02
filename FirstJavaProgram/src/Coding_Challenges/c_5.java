package Coding_Challenges;

import java.util.ArrayList;
//import java.util.Arrays;

public class c_5 {
    public static void main(String[] args) {
        ArrayList<String> MathList = new ArrayList<String>();
        MathList.add("Ram");
        MathList.add("Tom");
        MathList.add("Ravi");
        MathList.add("Tanvi");
        MathList.add("Vikas");

        // MathList.addAll(Arrays.asList(new String[]{"Ram", "Tom", "Ravi", "Tanvi", "Vikas"}));

        ArrayList<String> ScienceList = new ArrayList<String>();
        ScienceList.add("John");
        ScienceList.add("Ravi");
        ScienceList.add("Abhi");
        ScienceList.add("Vikas");
        ScienceList.add("Faisal");

        // ScienceList.addAll(Arrays.asList("John", "Ravi", "Abhi", "Vikas", "Faisal"));


        ArrayList<String> result = new ArrayList<String>();
        for (String m : MathList) {
            for (String s : ScienceList) {
                if (m == s) {
                    result.add(m);
                }
            }
        }

        System.out.println(result);
    }
}
