package com.careerdevs.ThirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java16Exception {
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



    public class Solution {
        public static void main(String[] args) throws IOException {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String S = bufferedReader.readLine();
            bufferedReader.close();
            try
            {


                // this is the parsed S value
                int newInt = Integer.parseInt(S);

                System.out.println(newInt);

            } catch(NumberFormatException e){
                System.out.println("Bad String");


            }

        }

    }
}
