package com.careerdevs;

public class EdabitFactorChallenge {
    public static boolean factorChain(int[] arr) {
        int counter = 0;

        for(int i =  1 ; i < arr.length-1 ;i++){
            if(arr[i+1] % arr[i] == 0){
                counter++;
                return true;
            }

        }
        return false;
    }
}
