package com.careerdevs.HackerRankInterview;

import java.util.List;

public class Day1Algorithimg {
    class Result {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */
        /*Task --
        input format..

        The first line contains an integer, the size of the array.
        The second line contains  space-separated integers that describe .


        output format
        Print the following  lines, each to  decimals:

        proportion of positive values
        proportion of negative values
        proportion of zeros
        * */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here

            // print out size of the array
            // we print out the values inside the array.



            // positive values
            double countP = 0;
            // negative value
            double countN =0;
            // values that = 0
            double lessThan = 0;



            for (int i = 0 ; i < arr.size();i++){


                if(arr.get(i) > 0){
                    // newNum = arr.get(i);
                    countP++;

                }else if (arr.get(i) < 0 ) {

                    countN++;


                }else if (arr.get(i) == 0 ){

                    lessThan++;

                }

            }

            countP = countP/arr.size();
            countN = countN/arr.size();
            lessThan = lessThan/arr.size();

            System.out.println(countP);
            System.out.println(countN);
            System.out.println(lessThan);



        }

    }
}
