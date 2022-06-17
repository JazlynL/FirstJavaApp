package com.careerdevs.CodingBatAlgo;

public class ContainsDoubleX {
    boolean doubleX(String str) {
        int counter=0;
        for(int i = 0 ; i < str.length()-1;i++){
            if(str.charAt(i) == 'x'){

                if(str.charAt(i+1) == 'x'){
                    counter++;
                    return true;

                }
                return false;
            }

        }
        return false;

    }
}
