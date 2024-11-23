package loops;


import java.util.Scanner;

// check automorphic
public class Program12_prime_factor_of_nuber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt(); // 25

        System.out.println("Prime factors are : ");

        int copy = n;
        for (int i = 2; i <= copy ; i++) {
            while(n%i == 0 ){
                System.out.print(i +" ");
                n/=i;
            }
        }

        System.out.println("\nPrime factors with optimized version : ");
        n=copy;
        for (int i=2; i*i <= n; i++){
            while (n%i==0){
                System.out.print(i + " ");
                n/=i;
            }
        }

        if(n>1){
            System.out.println(n);
        }

    }
}
