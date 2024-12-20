package oops;

public class LearnGetterSetter {
    String key;
    int val;
    // getter setter for value
    public int getVal() {
        return val;
    }
    public void setVal(int val) {
        this.val = val;
    }
    // getter setter for key
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public static void main(String[] args) {
        LearnGetterSetter demo = new LearnGetterSetter();
        demo.setKey("count");
        demo.setVal(50);
        System.out.println(demo.getKey() + " : " + demo.getVal());
    }


}
