package control_flow;

import java.util.Scanner;

// check user's voter validity
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if( age > - 1 &&  age < 151){
            if(age > 18){
                System.out.println("Valid voter");
            }else{
                System.out.println("You are not a voter.");
                System.out.println("You will be able to vote in " + (18-age) + (((18-age) > 1)?" years.":" year."));
            }
        }else{
            System.out.println("Invalid age.");
        }
    }
}
