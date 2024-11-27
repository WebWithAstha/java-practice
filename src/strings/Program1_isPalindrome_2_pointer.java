package strings;

public class Program1_isPalindrome_2_pointer {

    // method to check is palindrome
    public static boolean isPalindrome(String s){

        // initializing pointers
        int i =0 , j = s.length()-1;
        while (i<j){
        // checking pairs then updating pointers
        if(s.charAt(i++)!=s.charAt(j--))
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("astha"));
    }
}
