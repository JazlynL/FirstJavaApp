package com.careerdevs.CodingBatAlgo;

public class ComparingTwo {
    public int last2(String str) {

        // We are going to return a Srtricly Strings with a length > 2 otherwise return 0
        if(str.length()< 2){
            return 0;
        }

        // we are going to record the last two letters in the string.using substring method

        String newStr = str.substring(str.length()-2,str;

        int countByTwo=0;


        // then will begin iteration but iterate through everthing but the last two letters

        for(int i = 0 ; i <  str.length()-2;i++){
            // we are going to compare these two strings
            if(newStr.equals(str.substring(i,i+2))){
                countByTwo++;
            }
        }
        return countByTwo;
    }
}
