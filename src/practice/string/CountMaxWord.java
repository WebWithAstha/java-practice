package practice.string;

import java.util.Arrays;

public class CountMaxWord {
    public static void main(String[] args) {
        String[] sentences = {"hell hi", "wow thats great", "d"};

        int maxWord = 0;
        for (String sent : sentences) {
            String[] words = sent.split(" ");
            maxWord = Math.max(maxWord, words.length);
        }
        System.out.println(maxWord);

    }
}
