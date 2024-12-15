package treeMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class SortPeople {
    public static void main(String[] args) {
        String [] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        TreeMap<Integer,String> tree = new TreeMap<>(Collections.reverseOrder());

        for (int i=0;i<heights.length;i++){
            tree.put(heights[i],names[i]);
        }
        

        System.out.println(Arrays.toString(tree.values().toArray(new String[0])));


    }
}
