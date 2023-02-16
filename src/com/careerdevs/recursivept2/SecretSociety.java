package com.careerdevs.recursivept2;

import java.util.Arrays;
// importing the  Arrays package is important  to access the Array methods.
// import java.util.Arrays;

public class SecretSociety {

    public static String societyName(String[] friends) {
        String finalWord = "";
        Arrays.sort(friends);
        for (int i = 0; i < friends.length; i++) {

            finalWord += friends[i].charAt(0);

        }
       return finalWord;
    }
    public static String societyNameTwo(String[] friends) {

        // using the Array method to sort the name alphabetically.
        Arrays.sort(friends);

        // empty string to store empty result.
        String finalOrder = "";

        // a for loop to iterate through information
        for(int i = 0; i < friends.length ; i++){

            // to concatenate the whole order;
            finalOrder += friends[i].charAt(0);
        }

        // return the overall order .
        return finalOrder;

    }
}





