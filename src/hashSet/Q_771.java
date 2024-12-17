package hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Q_771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        HashSet<Object> hash = new HashSet<>();

        char[] jArr = jewels.toCharArray();
        char[] sArr = stones.toCharArray();

        int count = 0;


//        System.out.println(Arrays.toString(arr));


        for (int i = 0 ; i < stones.length();i++){

            System.out.println(jArr[0]);
            if(stones.contains(jArr[0]+"")){
//                hash.remove(jArr[0]);
                count++;
                System.out.println("hey");
            }
//            {
//                hash.add(jArr[0]);
//            }
        }

        System.out.println(hash);
        System.out.println(count);




    }
}
