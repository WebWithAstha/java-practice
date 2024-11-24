package loops;


import java.util.Scanner;

// check automorphic
public class Program13_sum_of_even_indexed_fabonacci_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt(); // 25

       int pre1 = 0,pre2 = 1;
       int sum = 0;

        for (int i = 0; i <= 2*n ; i++) {

            int current = pre1+pre2;
            if(i==0){
                current=0;
            }
            if(i%2==0){
                sum+=current;
            }
            System.out.print(current +" ");
            pre1 = pre2;
            pre2 = current;

        }

        System.out.println("\nSum  is : "+sum);


    }
}
