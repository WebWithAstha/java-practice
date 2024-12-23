package oops.constructorChaining;

// constructor chaining in same class
public class Constructor {

    Constructor(){
        this(1); // calling 1 parametrised constructor
        System.out.println("Default constructor.");
    }
    Constructor(int a){
        this(a,2); // calling 2 parametrised constructor
        System.out.println("Parameterised constructor. (params = "+a+" )");
    }

    Constructor(int a , int b){
        System.out.println("2 Parametrised (params are : "+a+ " "+b+" )");
    }

    public static void main(String[] args) {

        Constructor obj = new Constructor();

    }
}
