package class_object;

import java.util.Scanner;

public class CabService {

    double km,bill;
    String car_type;

    CabService(){
        km=0.0;
        bill=0.0;
        car_type="";
    }


    void calculate(){

        if(car_type.equals("Ac")){
            if(km <= 5 ) bill =150;
            else{
                bill = 150 + (km - 5 )*10;
            }
        }else if(car_type.equals("Non-Ac")){
            if(km <= 5 ) bill =120;
            else{
                bill = 120 + (km - 5 )*8;
            }
        }

    }

    void display(){
        System.out.println("Car type is : "+car_type);
        System.out.println("Km travelled : "+km);
        System.out.println("Total bill : "+km);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car type ( Ac or Non-Ac ) :" );
        String car_type = sc.nextLine();
        System.out.println("Enter km : ");
        double km = sc.nextDouble();

    }


}
