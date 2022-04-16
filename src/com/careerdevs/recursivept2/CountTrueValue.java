package com.careerdevs.recursivept2;

public class CountTrueValue {
    public static int countTrue(boolean[] arr) {


      // using this to iterate through array.
        int countTrue = 0;

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]){
                countTrue++;
            }
        }
        return countTrue;

    }
}
