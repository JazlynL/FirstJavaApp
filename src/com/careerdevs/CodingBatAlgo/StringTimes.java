package com.careerdevs.CodingBatAlgo;

public class StringTimes {
    //Discovered another way to solve it
    public String stringTimes(String str, int n) {

        // creating empty string to store future String Variations
        String result = "";
        // we are setting the counter to 0;
        int counterN = 0;

        // while int n which is the number we have to continue iteration
        // while n is greater than 0
        while (counterN < n){
            // we are going to concatenate the String result to the empty String
            result += str  ;
            // we use ++ operator to continue iteration
            counterN++;
        }
       // then we will return result.
        return result;


    }
    // another way to do it

    public String stringTimesNumTwo(String str, int n) {

        String result = "";

        for(int i = 0 ; i < n;i++){
            result+= str;
        }
        return result;
    }
}
