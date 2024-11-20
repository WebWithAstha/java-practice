package loops;


import java.util.Scanner;

// give prime in range
public class Program6_isPrime_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for (int j = 2; j <= n; j++) {
            // check single number is prime
            boolean isPrime = true;
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.print(isPrime ? j + " " : "");

        }


    }

}
