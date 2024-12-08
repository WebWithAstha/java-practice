package bufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputByBuffer {
    public static void main(String[] args) throws IOException {


        // buffer always takes input as string we need to parse into other data types

        // initialing bufferReader
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Enter a string : ");

        // input of string
        String str = br.readLine();

        System.out.println("Enter a number : ");
        // input of integer
        int num = Integer.parseInt(br.readLine());

        // input of boolean
        System.out.println("Enter a boolean : ");
        boolean bol = Boolean.parseBoolean(br.readLine());

        // input of char
        System.out.println("Enter a char : ");
        char ch = (br.readLine().charAt(0));



        System.out.println(str + " is of age : "+num + " Is it real ? "+bol+" His grade is : "+ch);


    }
}
