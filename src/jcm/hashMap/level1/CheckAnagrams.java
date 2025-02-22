package jcm.hashMap.level1;

import java.util.HashMap;

public class CheckAnagrams {
    public static void main(String[] args) {
        String s = "listen";
        String s2 = "silent";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch : s.toCharArray()) map1.put(ch,map1.getOrDefault(ch,0)+1);
        for(char ch : s2.toCharArray()) map2.put(ch, map2.getOrDefault(ch,0)+1);

        System.out.println((map1.equals(map2))?"Yes Anagram":"No not Anagram");
    }
}
