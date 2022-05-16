package com.careerdevs;

public class ReverseanArray {

    public static int[] reverse(int[] arr) {
        //
        int startOfIndex = 0;

        //
        int endOfIndex = arr.length-1;

        while(startOfIndex < endOfIndex){
            int temp = arr[endOfIndex];
            arr [endOfIndex] = arr[startOfIndex];
            arr[startOfIndex] = temp;
            startOfIndex++;
            endOfIndex--;
        }
        return arr;
    }
}
