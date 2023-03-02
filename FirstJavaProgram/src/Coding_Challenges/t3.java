package Coding_Challenges;

import java.util.Optional;

class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { 
        this.obj = obj; 
    } // constructor

    public T getObject() { 
        return this.obj; 
    }
}

public class t3 {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        Test<String> sObj
            = new Test<String>("Sai");
        System.out.println(sObj.getObject());

        String[] words = new String[10];
        Optional<String> checkNull
            = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");

    }
}
