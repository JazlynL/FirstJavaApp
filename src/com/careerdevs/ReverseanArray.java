package com.careerdevs;

public class ReverseanArray {

    public static int[] reverse(int[] arr) {
        //
        int startOfIndex = 0;

        //
        int endOfIndex = arr.length - 1;

        while (startOfIndex < endOfIndex) {
            int temp = arr[endOfIndex];
            arr[endOfIndex] = arr[startOfIndex];
            arr[startOfIndex] = temp;
            startOfIndex++;
            endOfIndex--;
        }
        return arr;
    }

    // alternative way to reverse array.


    public static int[] reverse1(int[] arr) {
        // we are going to intialize   the new array to the length of the Arr;
        int[] newArr = new int[arr.length];
        // we have a counter variable
        int counter = 0;
        //We then iterate through the loop backwards
        for (int i = arr.length - 1; i >= 0; i--) {
            //intialize  the  the array newArr to zero, then set it equal to Arr[i]
            newArr[counter] = arr[i];
            //We  then use the 0 index and incremental operator to increment the number
            counter++;
        }
        // we then return the new Array data we set in the for loop.
        return newArr;
    }
}
