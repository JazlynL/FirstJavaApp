package com.careerdevs.ThirtyDaysOfCode;


/*
A interface is a collection of abstract methods
no Implementations nor constructors.
its a template of a certain functionality..
* */
public class Day19interfaces {
    public int divisorSum(int n) {
        // intialize var to 0
        int newSum = 0 ;
        // creating the for loop intializing iteration to start at 1
        // setting conditional less then the val of n , because we want the iteration

        //to start from the value of n to below
        //
        for(int i = 1 ; i <= n ;i++){
            // if n is divisble by the i  and it equals 0
            if(n%i == 0){
                // we will add the empty variable to the overall sum.
                newSum = newSum + i;
            }

        }
        return newSum;
    }
}
}
