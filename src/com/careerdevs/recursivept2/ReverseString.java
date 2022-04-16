package com.careerdevs.recursivept2;

public class ReverseString {

    public static String reverse(final String str) {
        // using a to char array to grab each character of the word.
        char[] reverse = str.toCharArray();

        // creating a new instance of the String builder
        StringBuilder sb = new StringBuilder();
        for (int i = reverse.length-1; i >= 0 ; i--){
            sb.append(reverse[i]);

        }
        return  sb.toString();


    }

    public static String reverseString( String str) {
         char[] reverse = str.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = reverse.length -1 ; i >= 0 ; i--){
            // acceessing the array and appending it.
            reversed.append(reverse[i]);
        }
        return reversed.toString();
    }

}
