package string.problems;

import java.sql.SQLOutput;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {
        permute("HASSAN");


        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    }
   public static void permute(String full) {
   if (full == null || full.length() == 0) {
         System.out.println("You must provide a string of length > 0.");
         return;
      }
       permute("", full);


   }
    private static void permute(String prefix, String remaining) {
        if (remaining.length() ==0) {
            System.out.println(prefix);
            return;
        }
        for ( int i = 0; i <remaining.length(); i++) {
            permute(prefix + remaining.charAt(i), remaining.substring(i +1, remaining.length()));
        }

    }
}
