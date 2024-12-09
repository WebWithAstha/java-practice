package hashSet;

import java.util.HashSet;

public class Ques1 {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,2,1};
        HashSet<Integer> hash = new HashSet<>();

        for (int i = 0 ; i<arr.length;i++){
            if(hash.contains(arr[i])){
                hash.remove(arr[i]);
            }else{
                hash.add(arr[i]);
            }
        }

        System.out.println(hash);




    }
}
