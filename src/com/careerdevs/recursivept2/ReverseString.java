package com.careerdevs.recursivept2;

public class ReverseString {
    public static String reverseString( String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() -1 ; i >= 0 ; i--){
            StringBuilder append = reversed.append(str[i]);
        }
        return reversed.toString();
    }

}
