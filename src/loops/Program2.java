package loops;

import java.util.Scanner;

// Aceept an integer and print hello world n times
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 0 ; i<n ; i++){
            System.out.println("Hello World");;
        }
    }
}
