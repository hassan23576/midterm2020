package string.problems;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        //Implemented code
        Set<String> duplicates = duplicateWords(st);
        System.out.println("In this scenario duplicate words are " + duplicates);

    }
    public static Set<String> duplicateWords(String s) {

        DecimalFormat df = new DecimalFormat(".00");

        if (s == null || s.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicateWords = new HashSet<>();
        String[] array = s.split(" ");
        double avgLength = (double) s.length() / array.length;

        Set<String> set = new HashSet<>();
        ArrayList<String> alist = new ArrayList<String>();
        for (String word : array) {
            alist.add(word);
            if (!set.add(word)) {
                duplicateWords.add(word);
            }
        }
        for (String word : duplicateWords) {
            if (Collections.frequency(alist, word) > 1) {
                System.out.println("'" + word +"' occurs " + Collections.frequency(alist, word) + " times.");
            }
        }
        System.out.println("Average length of these words is: " + df.format(avgLength));
        return duplicateWords;
    }

}