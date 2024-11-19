package loops;


import java.util.Scanner;

// Check is n prime
public class Program5_isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
    if(n>1){

        for (int i = 2; i <= n/2 ; i++) {
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime?"It is prime":"Not prime");
    }else{
        System.out.println("Enter a number > 1.");
    }

    }

}
