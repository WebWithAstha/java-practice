package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Program1_array_inp_print_elem_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declare array with size 5
        int[] arr = new int[5];
        int sum = 0;

        // input elements and add elements
        System.out.println("Enter elements :");
        for (int i = 0; i <5 ; i++) {
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Array is : "+ Arrays.toString(arr)+ " & sum is : "+sum);
    }
}
