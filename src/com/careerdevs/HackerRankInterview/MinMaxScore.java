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
            // maria is playing a game of basketball, in this game of basketball she will be keeping score of all her point earned during a game.
            // from the first amount of points of her first game will be the determining factor on how we will record the rest of the points she has gained throughout the game.
            // We have two things to take account of from the first  game the min and max score gained from after thr first game
            // So we will intiliaze two values one is the min score gained from the game and the max score gained from the game, these vars will hold the count of max points from the previous records, and the second var value will record the least amount of points stored.
            // we want to iterate through the stored point inside the arraylist.
            // we want to identify the first index in the arraylist
            // once this value is identified we will compare it to the rest of the values in the list.
            // through iteration we will determine whather or not the data recorded after game 1 is greater than or less than.
            // once these values are determined we will want to then return the value with the breaking the most points at index 0 and the least points at index 1;

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

