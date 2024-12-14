package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Q1_FrequencyCount {

    public static Map<Integer,Integer> frequencyInOneLine(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();
        for (int elem : arr){
            map.put(elem, (map.getOrDefault(elem , 0)+1));
        }
        return map;

    }


    public static Map<Integer,Integer> frequency(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();
        for(int elem : arr){
            // element h
            if(map.containsKey(elem)){
                int val = map.get(elem);
                map.put(elem,++val);
            }else{
                map.put(elem,1);
            }
        }
        return map;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,5,7,3,5};

        System.out.println(frequency(arr));
        System.out.println(frequencyInOneLine(arr));
    }
}
