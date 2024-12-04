package strings;

import java.util.Arrays;

public class Program6_SplitStringAndCapitalize {

    public static String[] capitalizeFirstLetter(String s) {

        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            char ch = s1[i].charAt(0);
            if (!(ch >= 'A' && ch <= 'Z')) {
                ch = (char) (ch - 32);
                s1[i] = ch + s1[i].substring(1);
            }
        }
        return s1;
    }


    public static String[] capitalizeFirstAndLastLetter(String s) {
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            char ch = s1[i].charAt(0);
            char chLast = s1[i].charAt(s1[i].length()-1);
            if (!(ch >= 'A' && ch <= 'Z')) {
                ch = (char) (ch - 32);
                s1[i] = ch + s1[i].substring(1);
            }
            if (!(chLast >= 'A' && chLast <= 'Z')) {
                chLast = (char) (chLast - 32);
                s1[i] = s1[i].substring(0,s1[i].length()-1)+chLast;
            }

        }
        return s1;
    }


    public static void main(String[] args) {
        String s = "astha lodhi is here";

        System.out.println(Arrays.toString(capitalizeFirstLetter(s)));
        System.out.println(Arrays.toString(capitalizeFirstAndLastLetter(s)));
    }

}