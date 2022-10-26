package com.careerdevs.ThirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplesOfTwo {

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());


            // initialize it to 1 , to be able to output correct multiples
            for(int i = 1; i <= 10; i++){
                System.out.println( n + " x " + i + " = " + (n*i));
            }


            bufferedReader.close();
        }
    }
}
