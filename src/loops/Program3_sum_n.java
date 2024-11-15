package loops;


import java.util.Scanner;

// Print sum up to n
public class Program3_sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum+= i;
        }
        System.out.println("Sum of first "+n +" numbers is : "+sum);
    }

}
