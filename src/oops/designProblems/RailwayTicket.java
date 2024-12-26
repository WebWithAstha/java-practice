package oops.designProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RailwayTicket {
    String name;
    String coach;
    long mob_no;
    int amt;
    int totalAmt;

    // method taking name , coach , mobile , amt
    void accept() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter customer name : ");
        this.name = br.readLine();
        System.out.println("Enter coach [ First_Ac , Second_Ac , Third_Ac , Sleeper ] : ");
        this.coach = br.readLine();
        System.out.println("Enter mobile : ");
        this.mob_no = Long.parseLong(br.readLine());
        System.out.println("Enter amount : ");
        this.amt = Integer.parseInt(br.readLine());
    }


}
