package loops;


import java.util.Scanner;

// check automorphic
public class Program11_automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt(); // 25
        int sq = n * n;
        boolean isAuto = true;

        while (n > 0) {
            if (sq % 10 != n % 10) {
                isAuto = false;
                break;
            }
            n /= 10;
            sq /= 10;

        }
        System.out.println(isAuto ? "Automorphic" : "Not");


    }
}
