package com.careerdevs;

public class getXO {
    public static boolean getXO (String str) {
        String newStr = str.toLowerCase();
        int containX = 0;
        int  containO = 0;
        // using this to set it equal to eachother

        for(int i = 0 ; i < newStr.length(); i++){
            if(newStr.charAt(i) == 'x'){
                containX++;
            }if(newStr.charAt(i) == 'o'){
                containO++;
            }
        }
        if(containX == containO){
            return true;
        }
        return false;
    }

}
