package strings;


public class Program6_SplitStringAndCapitalize2 {

    public static String capitalize(String s){
        if(s.length()<3)
            return s.toUpperCase();
        char[] arr = s.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        arr[arr.length-1] = Character.toUpperCase(arr[arr.length-1]);

        return new String(arr); // converting array of char to a string


    }

    public static void main(String[] args) {
        String s = "astha is here";
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            s1[i] = capitalize(s1[i]);
        }
        String ans = String.join(" ",s1);
        System.out.println(ans);
    }

}