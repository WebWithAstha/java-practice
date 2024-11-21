package loops;


import java.util.Scanner;

// give a^b
public class Program8_separate_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        while (n>0){
            System.out.println(n%10);
            n/=10;
        }
    }
}
