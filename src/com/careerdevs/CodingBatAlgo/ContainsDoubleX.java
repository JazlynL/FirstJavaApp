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
    boolean doubleXTwo(String str) {
        // var is j == str.index of x
        int j = str.indexOf("x");
//if j is out of bounds which is repersented -1 return false;
        if( j == -1) return false;

        // if j +1 is greater than str.length
        if(j+1>=str.length())
            // if  J+1 is true return false
            return false;


// return true if j+1 and j+2 equals x
        return str.substring(j+1,j+2).equals("x");
    }
}
