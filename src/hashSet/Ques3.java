package hashSet;

import java.util.HashSet;

//Check if the Sentence Is Pangram

public class Ques3 {
    public static void main(String[] args) {


        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        HashSet<Character> letterSet = new HashSet<>();


        for (int i = 0; i < sentence.length(); i++) {
            letterSet.add(sentence.charAt(i));
        }

        System.out.println((letterSet.size() == 26));






    }
}
