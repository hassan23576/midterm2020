package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        long i,factrl=1;
        long number=5;//It is the number to calculate factorial

        for(i=1;i<=number;i++){
            factrl=factrl*i;
        }
        System.out.println("Factorial of "+number+" is: "+factrl);

        // using recursion
        System.out.println("Factorial of 5 is: "+factorial(5));

    }
    // Get factorial using recursion
    // method in class level
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }


}
