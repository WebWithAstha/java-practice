package loops;


import java.util.Scanner;

// give a^b
public class Program7_a_power_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pow = a;
        for (int i = 2; i <= b ; i++) {
            pow*=a;
        }
        System.out.println("a^b = "+pow);

    }
}
