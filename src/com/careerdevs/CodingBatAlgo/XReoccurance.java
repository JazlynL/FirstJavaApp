package com.careerdevs.CodingBatAlgo;

public class XReoccurance {

    int countXX(String str) {
        String result ="";

        int counterX = 0;

        for(int i = 0 ; i < str.length()-1;i++){
            if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
                result+= 'x';
                counterX++;
            }

        }
        return counterX;

    }
}
