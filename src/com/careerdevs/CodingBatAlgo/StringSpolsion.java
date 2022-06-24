package com.careerdevs.CodingBatAlgo;

public class StringSpolsion {
    public String stringSplosion(String str) {
        // we want to take the input
        //then we want to iterate through the string in a certain order
        //the order will continually add 1 to the previos iteration
        // then we want to return the String.

        String result = "";
        int counter = 0;

        for(int i = 0 ; i < str.length();i++){
            result += str.substring(0,i+1);
            counter++;
        }
        return result;

    }
}
