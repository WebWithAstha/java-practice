package arrays;

import java.util.Arrays;
import java.util.Scanner;

// check is array sorted
public class Program6_array_rotation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // input size
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        // declare array
        int[] arr = new int[size];

        // input elements
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }

        // main logic

        System.out.println("Enter k : ");
        int k = sc.nextInt();

        int[] brr = new int[size];
        int track = 0;
        for (int i = k; i < size ; i++) {
            brr[track++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            brr[track++] = arr[i];
        }

        System.out.println("Original array : "+Arrays.toString(arr));
        System.out.println("Rotated array by "+k+" elements : "+Arrays.toString(brr));

    }
}
