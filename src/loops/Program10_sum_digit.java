package loops;


import java.util.Scanner;

// give a^b
public class Program10_sum_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int copy = n;
        int sum = 0;
        while(n>0){
            sum+= n%10;
            n/=10;
        }
        System.out.println("sum of digit of "+copy + " is : "+sum);
    }
}
