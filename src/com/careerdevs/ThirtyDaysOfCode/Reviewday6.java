package com.careerdevs.ThirtyDaysOfCode;

import java.util.Scanner;

public class Reviewday6 {
    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            scan.nextLine();

            String newStr;

            for(int i = 0 ; i < input;i++){

                newStr = scan.nextLine();
                String even ="";
                String odd = "" ;

                for(int j = 0 ; j< newStr.length();j++){



                    if(j % 2 == 0){
                        even+=newStr.charAt(j);
                    }
                }
                for(int j = 0 ; j < newStr.length();j++){

                    if (j % 2 != 0){
                        odd += newStr.charAt(j);
                    }
                }
                System.out.println(even + " " + odd);
            }
            scan.close();

        }










    }
}
