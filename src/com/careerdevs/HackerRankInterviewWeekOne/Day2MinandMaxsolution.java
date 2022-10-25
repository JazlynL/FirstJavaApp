package com.careerdevs.HackerRankInterview;

import java.util.List;

public class Day2MinandMaxsolution {
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here

    //task
    //Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.
    //Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

// we  have an array of numbers ex [1,3,5,7,9]
// We Want the miniMinsum  it will be (4/5) elements. we want to add
//[1,3,5,7] (ignore biggest number 9)
// We want the Max miniSum also will be with (4/5) elements..(ignore Smallest Number)
//[3,5,7,9]
// min , max, then We want totalSum.
// TotalSum - max , TotalSum -min,
    int minSum = arr.get(0);
    int maxSum = arr.get(0);

    // this is to store the total value
    long sumF = 0;

// then we want to intialize a for loop


    for(int i = 0 ; i < arr.size();i++){
        sumF += arr.get(i);
        //  System.out.println(sumF);
        if( arr.get(i) < minSum)
            minSum = arr.get(i);
        if(arr.get(i) > maxSum){
            maxSum = arr.get(i);
        }
    }

    System.out.println((sumF- maxSum)+" "+(sumF -minSum));

/* sideNote = constraints 1 <arr[i] < 10 to the 9th power
it will  fit within a 32 bit number, we have to predict that a number output maybe greater than a
32 bit integer, we are able to use long because it will go up to 64 bits..*/



}
}


