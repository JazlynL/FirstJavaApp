package com.careerdevs.recursivept2.CodingBatAlgo;

public class getXO {
    public static boolean getXO (String str) {
        // we are going to lower case the string arg
        String newStr = str.toLowerCase();
        // we are creating a counter var to  iterate through  and hold
        // if  it contains  occurances we will store this documentation in these variables
        int containX = 0;
        int  containO = 0;

    //Using this for loop to iterate through the newly lower cased string
        for(int i = 0 ; i < newStr.length(); i++){
            // using charAt to see if we can find x within the string
            if(newStr.charAt(i) == 'x'){
                // if x is found we will continue iteration
                containX++;
                // using same built in method to find o occurances
            }if(newStr.charAt(i) == 'o'){
                // if o is found we will continue iteration
                containO++;
            }
        }
        // if x and o  is equal
        if(containX == containO){
            // return boolean true;
            return true;
        }
        return false;
    }

}
