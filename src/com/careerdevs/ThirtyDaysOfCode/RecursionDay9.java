package com.careerdevs.ThirtyDaysOfCode;

public class RecursionDay9 {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    class Result {

        /*
         * Complete the 'factorial' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER n as parameter.
         *
         */
        public static void main(String[] args) {
           // we are pacing a value within the parameter, We are using this value to set the vlalue within the method
            example(3);
        }



        // recursion is creating a function if you call a method within a method , the method will overflow the call stack of
        // the program,  will continue to call within itself due to no way to tell the program about breaking the recursive call within the function.
        /* example
         of recursive algorithim  */
        public static int example(int count){
          // this is a way to tell the program once the index is less than or equal to one it will break out the program, instead of continuity of the method
            // calling with itself.
            /*BaseCase*/
            if(count <= 1){
                return 1;
            }else{
                // this will get the run the iteration from the back of the index to -> 0. the count  will keep the iteration till its no more, then the conditional
                // will fire once the condition of the data is true.
                // once all the values are set , it will shoot back up in iteration. till the top value.
                return (count -1);
            }

        }

        public static int factorial(int n) {
            // Write your code here
            if(n < 1){
                return 1;
            }
            return n * factorial(n-1);
        }

    }

}
