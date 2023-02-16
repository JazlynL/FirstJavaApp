package com.careerdevs.ThirtyDaysOfCode;

public class Day17Moreexceptions {
    int power(int n , int p){
        // creating the conditiopnsl if int n or p is negative
        if(n < 0 || p <0 )
        // throw this exception if it is a negative integer
        { throw new IllegalArgumentException("n and p should be non-negative"); }


        // result 1 to do the math
        int result = 1;


        // while p that stores the to the power value..
        while (p > 0){
            // we will multiply result with n
            result= result * n;

            // the we will decremeant through the p value
            p--;
        }

      // return  the result....
        return result;




    }
}
