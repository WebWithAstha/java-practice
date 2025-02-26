package oops.inheritance;

class DemoParent{
  String data = "hwllo";
  void zameen(){
      System.out.println("Lelo Zameen");
  }
}

public class Demo extends DemoParent {

    void getdata(){
        System.out.println(super.data);
    }
//    void zameen(){}

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.getdata();
        obj.zameen();
    }

}
