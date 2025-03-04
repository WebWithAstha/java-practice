package practice.string;

public class CountVowelConsonant {

    public static void countVowConsSpace(String s) {

        //Write your code here
        int v = 0, c = 0, sp = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> v++;
                case ' ' -> sp++;
                default -> c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Spaces: " + sp);
    }

    public static void countVowConsSpaceWithoutSwitch(String s) {

        //Write your code here
        int v = 0, c = 0, sp = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U' :
                    v++;
                    break;
                case ' ' :
                    sp++;
                    break;
                default : c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Spaces: " + sp);
    }

    public static void cVCon(String s) {

        int vCount = 0;
        int cCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch >= 'a' && ch <= 'z') {

                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' -> vCount++;
                    default -> cCount++;
                }
            }
        }
        System.out.println("Vowels are  : " + vCount + " Consonant count is : " + cCount);


    }

    public static void main(String[] args) {
        String s = "hello world";
//        String s = "This is a parrot. It is green in color.";

        countVowConsSpaceWithoutSwitch(s);

    }
}
