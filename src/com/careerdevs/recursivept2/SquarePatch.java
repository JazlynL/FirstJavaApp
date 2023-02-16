package com.careerdevs.recursivept2;

import java.util.Arrays;

public class SquarePatch {
    public static int[][] squarePatch(int n) {



        // creating the variables to hold the data.
        int numOfSubArray = n;
        int numOfSubElements = n;
        int valueOfElms =n;




        // creating a new sub array with an int data type.
        // Storing it in a variable
         int [] [] squareArray =  new int[numOfSubArray][numOfSubElements];






        /* using a for loop to assign the value to each element and iterating
         through the sub array and assign the values.*/

        for(int i = 0 ; i < squareArray.length; i++){

            // we are using the Arrays class to be able to
            // capture the data and create a string out of it
            System.out.println(Arrays.toString(squareArray[i]));

            //creating a nested for loop to have access to each element in the array

            for(int j = 0 ; j < squareArray[i].length;j++){

               // System.out.println(squareArray[i][j]);

                //assigning each element tp the n variable.
                squareArray[i][j]= valueOfElms;
            }

        }

        System.out.println(Arrays.toString(squareArray));


        //return statement.
//        return  squareArray;

    }

    public static void main(String [] args){


        int num = 3;


        int [] [] square = squarePatch(3);

        System.out.println("Square Patch : \n \n ("+ num+ " ) -> [");

      for(int i = 0 ; i < square.length;i++){
          System.out.println("\t"+Arrays.toString(square[i]));
      }

        System.out.println("]");
    }
}
