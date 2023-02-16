package com.careerdevs.ThirtyDaysOfCode;

/*
Allow you to generalize what you put in your  data structres
your containers of data.

for example :
some data dtructures , Linked Lists -> only ont things is programmed to
a certain tupe
but
we still a consitent datatype throught the container

example code

public static <T  extends Comparable<T>> T findMax(T a, T b){
int n = a.compareTo(b)
if(n < 0){
return b;}
else{
return a;
}}

*/

public class Day21Generics {
    import java.util.*;

    class Printer <T> {

        /**
         *    Method Name: printArray
         *    Print each element of the generic array on a new line. Do not return anything.
         *    @param A generic array
         **/

        // Write your code here

        //Write a single generic function named printArray; this function must take an array of generic elements as a parameter (the exception to this is C++, which takes a vector). The locked Solution class in your editor tests your function.

        public T[] printArray(T [] array){
            // for loop through the array.
            for (T t : array) {
                // creating the for loop to iterate through the array
                System.out.println(t);

            }
            // returning the array

            return array ;

        }
    }
}

