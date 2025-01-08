package oops.interfaces;



interface Father{
    void study();
}

interface Mother{
    void study();
}

class Demo{
    void demo(){
        System.out.println("demo");
    }
}

// public class Example2 implements Father,Mother extends Demo { // this will throw err
public class Example2 extends Demo implements Father,Mother {

    // overriding / implementing method of interface
    public void study(){
        System.out.println("English");
    }


    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.demo();
        obj.study();
    }

}
