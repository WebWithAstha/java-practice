package oops;

import java.util.Scanner;

public class CabService {

    String car_type;
    double km;
    double bill;

    // def constructor to initialize
    CabService(){
        car_type="";
        km=0.0;
        bill=0.0;
    }

    // method to get car_type and km
    void accept(){
        Scanner sc = new Scanner(System.in);

//        this.car_type = car_type;
        System.out.println("Enter car type : ");
        this.car_type = sc.nextLine();
//        this.km = km;
        System.out.println("Enter km travelled : ");
        this.km = sc.nextDouble();

    }
    // method to calc bill
    void calculate(){
        if(car_type.equals("Ac")){
            if(km<=5) bill = 150;
            else bill = 150 + (km-5)*10;
        } else if (car_type.equals("Non-Ac")) {
            if(km<=5) bill = 120;
            else bill = 120 + (km-5)*8;
        }else{
            System.out.println("Invalid car type.");
        }
    }

    void display(){
        System.out.println("CAR_TYPE : "+car_type);
        System.out.println("KILOMETER TRAVELLED : "+km);
        System.out.println("TOTAL BILL : "+bill);
    }

    public static void main(String[] args) {
        CabService cb = new CabService();
        cb.accept();
        cb.calculate();
        cb.display();
    }





}
