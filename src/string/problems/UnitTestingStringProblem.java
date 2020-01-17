package string.problems;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        try {//Unit test for anagram
            Assert.assertEquals(Anagram.isAnagram("ACT","CAT"),true);
            System.out.println("Anagram test Passed.");
        }catch (AssertionError as){
            System.out.println("Anagram test Failed!!!!");
        }

        try {//Unit test for LargestWord
            String a = "Honesty is the best policy";
            Assert.assertEquals(DetermineLargestWord.largestWord(a),"Honesty");
            System.out.println("Determine largest value unit test Passed.");
        }catch (AssertionError as){
            System.out.println("Determine largest value unit test Failed!!!.");
        }

        try {//Unit test for DuplicateWord
            Set<String> set = new HashSet<>();
            set.add("Java");
            set.add("is");
            String test = "Java is a programming Language. Java is also an Island of Indonesia";
            Assert.assertEquals(DuplicateWord.duplicateWords(test),set);
            System.out.println("Duplicate word unit test Passed.");
        }catch (AssertionError as){
            System.out.println("Duplicate word unit test Failed!!!.");
        }

        try {//Unit test for palindrome
            String test = "MOM";
            boolean expected = false;
            Assert.assertEquals(Palindrome.isPalindrome(test),expected);
            System.out.println("Palindrome unit test passed.");
        } catch (AssertionError as){
            System.out.println("Palindrome unit test failed.");
        }
    }
}
