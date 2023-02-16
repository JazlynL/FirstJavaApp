package com.careerdevs.recursivept2;

public class FindMinAndMaxVal {
    public static int[] minMax(int[] arr) {
        int minNum = arr[0];
        int maxNum = arr[0];

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] >= maxNum){
                maxNum = arr[i];
            }if(arr[i]<= minNum){
                minNum = arr[i];
            }
        }

        // remember when working with arrays or arraylist we have to create a new instance of that variable;
        return new int[]{minNum,maxNum};
    }

    public static int differenceMaxMin(int[] arr) {
        int maxNum = arr[0];
        int minNum= arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] >= maxNum){
                maxNum = arr[i];
            }
            if(arr[i]<minNum){
                minNum = arr[i];
            }
        }
        return maxNum - minNum;

    }

}
