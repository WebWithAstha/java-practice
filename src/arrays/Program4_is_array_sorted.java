package arrays;

import java.util.Scanner;

// check is array sorted
public class Program4_is_array_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input size
        System.out.println("Enter elements :");
        int size  = sc.nextInt();

        // declare array
        int[] arr = new int[size];

        // input elements
        System.out.println("Enter elements :");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        // main logic
        boolean isSorted = true;
        for (int i = 0; i < size-1 ; i++) {
            if(arr[i+1]<arr[i]){
                isSorted=false;
                break;
            }
        }
        System.out.println(isSorted?"Sorter in increasing order. ":"Not sorted.");
    }
}
