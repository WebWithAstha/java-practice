package strings;

public class Program4_toggle_string {
    public static void main(String[] args) {
        String s = "AsThaLoDhI";
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch<= 'Z'){
                ans+=(char)(ch+32);
            }else{
                ans+=(char)(ch-32);
            }
        }
        System.out.println(ans);

    }
}
