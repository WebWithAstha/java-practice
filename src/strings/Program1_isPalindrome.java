package strings;

public class Program1_isPalindrome {
    public static void main(String[] args) {
        String s = "maaam";
        String rev = "";
        for (int i = s.length()-1; i >=0; i--) {
            rev+=s.charAt(i);
        }
        System.out.println(rev.equals(s) ? "Palindrome" :"Not Palindrome");
    }
}
