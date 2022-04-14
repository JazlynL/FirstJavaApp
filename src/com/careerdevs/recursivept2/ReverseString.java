package com.careerdevs.recursivept2;

public class ReverseString {
    public static String reverseString( String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() -1 ; i >= 0 ; i--){
            // acceessing the array and appending it.
            reversed.append(str[i])
        }
        return reversed.toString();
    }

}
