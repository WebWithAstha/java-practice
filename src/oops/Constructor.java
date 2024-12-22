package oops;

public class Constructor {

    Constructor(){
        System.out.println("Default constructor.");
    }
    Constructor(int a){
        System.out.println("Parameterised constructor. (params = "+a+" )");
    }

    Constructor(int a ,int b){
        System.out.println("2 Parametrised (params are : "+a+ " "+b+" )");
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(1);
        Constructor obj3 = new Constructor(1,2);
    }
}
