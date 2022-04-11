package com.careerdevs.recursivept2;

public class FindMinAndMaxVal {
    public static double[] minMax(double[] arr) {
        double minNum = arr[0];
        double maxNum = arr[0];

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] >= maxNum){
                maxNum = arr[i];
            }if(arr[i]<= minNum){
                minNum = arr[i];
            }
        }

        // remember when working with arrays or arraylist we have to create a new instance of that variable;
        return new double[]{minNum,maxNum};
    }


}
