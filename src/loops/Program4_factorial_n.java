package loops;


import java.util.Scanner;

// Print factorial n
public class Program4_factorial_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i > 0  ; i--) {
            fact*=i;
            if(i>1)
                System.out.print(i + " * ");
            else
                System.out.print(i + " = ");

        }
        System.out.println(fact);
    }

}
