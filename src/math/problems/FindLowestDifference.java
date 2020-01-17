package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 13
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        System.out.println("Lowest difference between two array is "+FindLowestDifference.lowestDifference(array1,array2));

    }

    public static int lowestDifference(int[] array1,int[] array2 ) {

        int lowest1 = Integer.MAX_VALUE;

        for (int i = 0; i < array1.length; i++) {
            if (lowest1 > array1[i]) {
                lowest1 = array1[i];
            }
        }

        int lowest2 = Integer.MAX_VALUE;

        for (int j = 0; j < array2.length; j++) {
            if (lowest2 > array2[j]) {
                lowest2 = array2[j];
            }
        }
        int difference;
        if (lowest1 > lowest2) {
            difference = lowest1 - lowest2;

        } else {
            difference = lowest2 - lowest1;

        }
        return difference;
    }
}
