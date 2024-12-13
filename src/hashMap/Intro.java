package hashMap;

import java.util.HashMap;

public class Intro {
    public static void main(String[] args) {
        HashMap<String,Integer> hMap = new HashMap<>();

        hMap.put("Devraj",5);
        hMap.put("Sumit",4);
        hMap.put("Astha",5);
        System.out.println(hMap);

        hMap.put("Sumit",5); // overwrites the previous one
        System.out.println(hMap);

        System.out.println(hMap.get("Sumit"));
        System.out.println(hMap.containsKey("Sumit"));
        System.out.println(hMap.containsValue(5));

        // gives set of all the values
        System.out.println(hMap.values());

        // gives set of all the keys
        System.out.println(hMap.keySet());

        // traversing keys
        for (String name : hMap.keySet()){
            System.out.println(name);
        }

        // traversing values
        for (Integer sem : hMap.values()){
            System.out.println(sem);
        }


    }
}
