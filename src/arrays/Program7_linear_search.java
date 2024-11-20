package arrays;

import java.util.Scanner;

// linear search
public class Program7_linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        // declare array
        int[] arr = new int[size];

        // input elements
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // main logic

        // input find
        System.out.println("Enter element to find : ");
        int find = sc.nextInt();
        int foundAt = -1;

        for (int i = 0; i < size ; i++) {
            if(arr[i] == find){
                foundAt=i;
                break;
            }
        }
        System.out.println("Element found at : "+foundAt);

    }
}
