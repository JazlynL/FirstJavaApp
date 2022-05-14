package com.careerdevs.recursivept2;

public class Concat {
    public static String getWord(String left, String right) {
        String newWord = left.substring(0,1).toUpperCase() + left.substring(1);
        String [] newArr = {newWord,right};
        return newArr[0].concat(newArr[1]);

    }
}
