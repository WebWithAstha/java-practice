package arrays;

import java.util.Arrays;
import java.util.Scanner;


// bubble sort then binary search
public class Program8_bubble_sort_then_binary_search {

    public static void bubbloSort(int[] array, int size){

        for (int j = 0; j < size-1 ; j++) {
            for (int i = 0; i < size-1-j ; i++) {
                if(array[i+1]<array[i]){
                    int temp= array[i+1];
                    array[i+1]= array[i];
                    array[i]=temp;
                }
            }
        }

    }

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
            arr[i]= sc.nextInt();
        }

        // sorting array
        bubbloSort(arr,size);
        System.out.println(Arrays.toString(arr));

        // logic for binary searching

        // input elem to find
        System.out.println("Enter element to find : ");
        int find = sc.nextInt();

        int foundAt = -1;
        int start = 0;
        int end = size-1;
        int mid = (start+end)/2;

        while (start<=end){
            if(arr[mid]==find){
                foundAt=mid;
                break;
            }else if(arr[mid]>find){
                end= mid-1;
            }else{
                start = mid+1;
            }
            mid = (start+end)/2;
        }

        System.out.println("found at : "+foundAt);


    }
}
