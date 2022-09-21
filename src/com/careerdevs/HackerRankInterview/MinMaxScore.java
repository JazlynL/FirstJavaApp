package com.careerdevs.HackerRankInterview;

public class MinMaxScore {


        /*
         * Complete the 'breakingRecords' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY scores as parameter.
         */

        public static List<Integer> breakingRecords(List<Integer> scores) {
            // Write your code here

            // keep track of points
            int minPoints = 0;
            int maxPoints = 0;

            // scores.. min and max values
            int minScore = scores.get(0);
            int maxScore = scores.get(0);



            // since we are, setting the indexes to 0 , we will set i to number 1...
            for(int i = 1 ; i < scores.size();i++){
                if(scores.get(i) > maxScore){
                    maxScore = scores.get(i);
                    maxPoints++;
                }

                if(scores.get(i) < minScore){
                    minScore = scores.get(i);
                    minPoints++;
                }
            }





            //dynamically sizeable. we will be using 2 elements int[2].
            //Arrays are static.
            List<Integer> minList = new ArrayList<Integer>();
            minList.add(maxPoints);
            minList.add(minPoints);

            return minList;

        }

    }

