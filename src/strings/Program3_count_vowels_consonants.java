package strings;

public class Program3_count_vowels_consonants {

    public static void main(String[] args) {

        String s = "dcsvnfa";
        int vowel = 0, consonant = 0;
        for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
            switch (ch){
                case 'a','e','i','o','u' -> vowel++;
                default -> consonant++;
            }
        }
        System.out.println("Vowels h : "+vowel+" Consonant h : "+consonant);

    }

}
