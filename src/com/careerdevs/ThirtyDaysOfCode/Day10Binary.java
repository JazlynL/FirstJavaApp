package com.careerdevs.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day10Binary {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



    public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            // this allows iteration for future use
            int count = 0 ;
            // this kind of works as a storage for once we are able to
            // get the counts other than 0 ;
            int max = 0;

            // we will intialize a variable  an use The BinaryTo sting method
            String newStr = Integer.toBinaryString(n);

            //once we intialized that string we will iterate through the newly intialized string
            // We will turn our regular test case which in human its 0-9, once it becomes over nine thats when we will use the exponents to properly convert that data.

            for(int i = 0 ; i < newStr.length();i++){
                //since we converted the number using the toBinaryString
                // it is now reading int n as binary numbers, once we have the testcase as binary numbers,we are able to properly iterate through the value as a converted binary number
                // we will use charAt to see if it equal to character value 0, if it is
                //set count = 0;
                //then continue
                if(newStr.charAt(i) == '0'){
                    count = 0;
                    continue;
                }else{
                    //Otherwizeee, continue the iteration through the string
                    count++;
                }
                // if count is greater than max set the value of max to the count value.
                if(count > max){
                    max = count;
                }
            }
            System.out.println(max);

        }
    }
}
