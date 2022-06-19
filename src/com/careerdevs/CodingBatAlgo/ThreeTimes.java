package com.careerdevs.CodingBatAlgo;

public class ThreeTimes {
    public String frontTimes(String str, int n) {
        // since we want to take the first three from the string
        // we will set the int for 3
        int  frontLen = 3;

        // then we are comparing the length to string length
        // if the length is less then three
        // store the new string length to front length
        if(str.length() < frontLen){
            frontLen = str.length();
        }


        // then we are using the sub string method
        // creating a new string that starts at index 0 and ends at the
        // the newly stored string length which is 3.
        String frontLenTwo = str.substring(0,frontLen);

       // creating an empty string to store the new string into the
        // string
        String result = "";


        // for loop, looping through  n because it holds the integer value.
        for(int i = 0 ; i < n; i++){

            // using += operator to store the newly constructed string.
            result += frontLenTwo ;
        }
      // return result.
        return result;
    }
}
