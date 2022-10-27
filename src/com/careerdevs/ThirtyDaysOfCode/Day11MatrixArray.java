package com.careerdevs.ThirtyDaysOfCode;

import java.util.List;

public class Day112DArray {
    public static int  hourGlass(List<List<Integer>> arr){

        // we want to find the max  in the constraints it goes from -9 - 9
        // the max sum for the hourglass on the side is 7  7 * -9 = -63
        // this will be the max set for now of the hourglass
        int maxSum = -63;



        // then we want to access the elements within the two d arrays that is set inside the parameter
        int row = arr.size();
        // we intialize that to 0 because it will grab the length of the whole first column which is set to index 0.
        int column = arr.get(0).size();


        for(int i = 0 ; i < row-2;i++){
            for(int j = 0 ; j < column-2;j++){
                // current value
                int hourGlass = 0;
                hourGlass = arr.get(i).get(j) + arr.get(i).get(j+1) +arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j) + arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);

                maxSum = Math.max(maxSum, hourGlass);
            }
        }
        return maxSum;


    }
}
