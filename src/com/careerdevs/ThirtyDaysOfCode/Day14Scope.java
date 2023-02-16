package com.careerdevs.ThirtyDaysOfCode;



// learning about scope within
// packages within Java
// there is a lot of packages , within java that is built-in
// ex. util ,lang , io , net
// there is teo different ways to do imports within java
// you can either use a util.* - which will implement various different classes within the package
// or you can use the individual package name you want to access..
public class Day14Scope {
    public Difference(int [] element){
        this.elements = element;
        // System.out.println(element);
    }

    // difference between two integers is a-b;
    //

    //A computeDifference method that finds the maximum absolute difference between any  numbers in  and stores it in the  instance variable.

    public int computeDifference(){
        // maximum difference


        // get the value from the elements field

        // to store the greatest value
        int newDifference = 0;

        // getting the data from here
        for(int i = 0; i < elements.length-1; i++){

            // using a nested for loop to access that other value we want to take from that element,
            for(int j = 1 ; j < elements.length; j++){

                // using mathAbs to get the absolute value  of the difference  of these two indexes i -j
                newDifference = Math.abs(elements[i] - elements[j]);

                // if that newValue is greater than the already instantiated value, set the max differnce to newdifference
                if(newDifference >= maximumDifference){
                    maximumDifference = newDifference;
                }
            }
        }


       // returning the max value,
        return maximumDifference;



        //




    }
}
