package hashSet;

import java.util.HashSet;

public class Intro {
    public static void main(String[] args) {
        HashSet<Integer> hash= new HashSet<>() ;
        hash.add(100);
        hash.add(20);
        hash.add(200);
        // duplicate elems nhi dlte
        hash.add(100);
        hash.add(10);

        // removes element
        hash.remove(100);
        // returns true / false
        System.out.println(hash.contains(20));
        System.out.println(hash);
    }
}
