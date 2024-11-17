package arrays;

import java.util.Arrays;
import java.util.Scanner;

// find greatest and its index
public class Program2_greatest_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        // declare array
        int[] arr =new int[size];

        // input element
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }

        // main logic
        int maxI=0;
        for (int i = 1; i < size ; i++) {
            if(arr[i]>arr[maxI]){
                maxI=i;
            }
        }
        System.out.println("Max element is : "+arr[maxI]+" at index "+maxI);

    }
}
