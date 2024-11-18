package arrays;

import java.util.Arrays;
import java.util.Scanner;

// check is array sorted
public class Program5_reverse_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input size
        System.out.println("Enter elements :");
        int size  = sc.nextInt();

        // declare arrray
        int[] arr = new int[size];

        // input elements
        System.out.println("Enter elements :");
        for (int i = 0; i < size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(arr));

        // main logic 1 : reverse array in new array
        int[] brr = new int[size];
        for (int i = size-1; i >=0 ; i--) {
            brr[size-i-1] = arr[i];
        }
        System.out.println("Reverse of array using new array is : "+ Arrays.toString(brr));

        // main logic 2 : reverse array without new array
        for (int i = 0; i < size/2 ; i++) {
            if(i!=(size-1-i)){
                int temp = arr[i];
                arr[i] = arr[size-1-i];
                arr[size-1-i] = temp;
            }
        }
        System.out.println("Reverse of array without new array is : "+Arrays.toString(arr));




    }
}
