package practice.string;

public class CountPrefixString {
    public static void main(String[] args) {
        String[] arr = {"a","un","unfair","unwanted","unchanged","predefined"};
        int count = 0;
        String pre = "un";

        for(String word :arr){
            if(word.length()>= pre.length()){
                if(pre.equals(word.substring(0,pre.length())))count++;
            }
        }
        System.out.println(count);
    }
}
