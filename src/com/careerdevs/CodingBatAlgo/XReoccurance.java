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

    // refactored code

    int countXXTwo(String str) {

        int counterStr = 0;
        String newStr = "";
        for(int i = 0 ; i < str.length()-1;i++){
            // using substring to create a newStr
            if(str.substring(i,i+2).equals("xx")){
                newStr+= str;
                counterStr++;
            }

        }
        return counterStr;


    }

    // another way.
    int countXXThree(String str) {

        int counterForX = 0;
        for(int i = 0 ; i < str.length()-1;i++){
            if(str.substring(i,i+2).equals("xx"))
                counterForX++;
        }
        return counterForX;

    }

}
