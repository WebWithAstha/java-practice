package oops.interfaces;


// interface me defaule me sare methods public or abstract hote h

// class inherits class (extends)
// class inherits interface (implements)
// interface inherits interface (extends)



interface Papa {
    void padhaiKro();
}

interface Mummy {
    void padhaiKro();
}


public class Intro implements Papa, Mummy {


    public void padhaiKro() {
        System.out.println("Physics");
    }


    public static void main(String[] args) {

        Intro obj = new Intro();
        obj.padhaiKro();
    }
}
