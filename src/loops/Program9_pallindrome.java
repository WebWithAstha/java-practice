package loops;


import java.util.Scanner;

// give a^b
public class Program9_pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int copy = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10 + digit;
            n/=10;
        }
        System.out.println(rev);
        System.out.println(rev==copy? "Palindrome":"Not palindrome");
    }
}
