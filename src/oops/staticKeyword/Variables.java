package oops.staticKeyword;

public class Variables {

    // non-static variables can be accessed by objects only
    String city = "Bhopal";

    // can be accessed both via obj or independently
    static String name = "Astha";

    static void getAge() {

        //can't be used in a method : wants to get associated with class but is in method
//        static int age = 20; // throws err
        int count = 20;

        System.out.println(count);

    }

    public static void main(String[] args) {
        System.out.println(name);

        // non-static variable city cannot be referenced from a static context
//        System.out.println(city); // throws err

        // static method directly called
        getAge();

    }

}
