package arrays;

import java.util.Arrays;
import java.util.Scanner;

// find 1st & 2nd greatest and its index
public class Program3_second_great_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        // array
        int[] arr = new int[size];

        // input of elements
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();

        }

        // main logic
        int great1 = 0, great2 = -1;
        for (int i = 1; i < size; i++) {
            if(arr[i]>arr[great1]){
                great2= great1;
                great1=i;
            }else if( arr[i]< arr[great1] && ( great2 == -1 || arr[i]>arr[great2] )){
                great2 =i;
            }
        }
        System.out.println("In Array "+Arrays.toString(arr)+" 1st greatest is  : "+ arr[great1]+" & 2nd is "+ ((great2 == -1) ?"not found" :arr[great2]));

    }
}
