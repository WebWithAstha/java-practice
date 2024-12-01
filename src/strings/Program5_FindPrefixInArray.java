package strings;

public class Program5_FindPrefixInArray {

    public static boolean startsWithCustom(String o,String pre){
        if (pre.length()>o.length()) return false;
        for (int i = 0; i < pre.length(); i++) {
            if(o.charAt(i)!=pre.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"atlast", "atmost","cyan","attend","grey"} ;
        String pre  = "at";
        int count = 0;
        for (String word: words) { // using enhanced for loop
            if(Program5_FindPrefixInArray.startsWithCustom(word,pre)){ // using custom method
//          if(word.startsWith(pre)){
                count++;
            }
        }
        System.out.println("Words with prefix '"+pre+"' are : "+count);
    }
   }
