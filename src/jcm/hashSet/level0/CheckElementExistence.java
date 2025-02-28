package jcm.hashSet.level0;

import java.util.HashSet;

public class CheckElementExistence {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1;i<6;i++) set.add(i*10);
        System.out.println(set.contains(30)?"Yes 30 exists":"No 30 doesn't exist");
    }
}
