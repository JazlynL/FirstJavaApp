package com.careerdevs.CodingBatAlgo;

public class EveryOtherChar {
    public String stringBits(String str) {



        String result = "";
       // since we are going to increment every other char
        // we will increment by two
        for (int i = 0 ; i < str.length();i+=2){
            {
                // alternativaly we can you str.charAt(i)
                result += str.substring(i,i+1);

            }
        }


        return result;

    }
}
