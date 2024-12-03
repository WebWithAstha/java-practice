package arraylist;

import java.util.ArrayList;

public class BasicFuns {

    public static void main(String[] args) {
//        int[] arr = new int[5];
        ArrayList<Integer> list = new ArrayList<>();

        // addin elements using add()
        list.add(50);
        list.add(55);
        list.add(60);
        list.add(65);
        list.add(70);
        list.add(75);
        list.add(80);
        list.add(85);

        // printing
        System.out.println(list);

        // deleting element at index
        list.remove(4);
        System.out.println(list);

        // deleting element
        list.remove(Integer.valueOf(50));
        list.remove((Integer) 55);
        System.out.println(list);

        // delete all elements
//        list.clear();
//        System.out.println(list);


        // replacing element at an index
        list.set(0,0);
        System.out.println(list);

        // fetching element at index
        System.out.println(list.get(1));

        // checking element's existence
        System.out.println(list.contains(80));

        // length
        System.out.println(list.size());

        // getting index of element
        System.out.println(list.indexOf(65));

        // getting sub array
        System.out.println(list.subList(3,5));


    }

}
