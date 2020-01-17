package math.problems;

import java.util.ArrayList;


public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int fabonaci[] = new int[40];
        System.out.println(arrayFibo(fabonaci));
    }

    public static ArrayList<Integer> arrayFibo(int fab[]){

        ArrayList<Integer> ar = new ArrayList<>();

        for (int m = 0; m < fab.length; m++) {
            if (m < 2) {
                fab[m] = m;
                ar.add(fab[m]);

            } else {
                fab[m] = fab[m - 2] + fab[m - 1];
                ar.add(fab[m]);
            }
        }

        return ar;
    }

}
