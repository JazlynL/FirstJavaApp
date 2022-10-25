package com.careerdevs.HackerRankInterview;

public class WeekTwoLonelyInteger {
    public static int lonelyinteger(List<Integer> a) {



        // Write your code here

        // we have an array list of number values
        // within this array list they will be double occurances in the array
        //ex = [1,2,3,4,3,2,1]
        // within this arraylist of number values we want to find the unique num value. in example above
        // it will be num 4.


        // n is going to be an odd number, constraints are 1 < n < 100
        // its going to be an odd mumber of integers




        // we are using a set.
        // we can use sets as a a tool to see something exists in that position.in sets we arent able to use duplicate values
        // thats why a problem like this is a good example
        //of finding
        Set<Integer> set = new HashSet<>();

        // we will have to intialize a countVar.
        int lonelyInt = 0;


        for(Integer i : a){
            // we using this conditional to see
            if(!set.contains(i)){
                // if the value does not match within the set we want to add it
                set.add(i);
            }else{
                // else we want to remove it from the set
                set.remove(i);
            }
        }


        // we can also do it this way too !
        return set.iterator().next();


        // we can use this method or we can also
        // so once we go through he
        //  for(Integer s : set){
        //      lonelyInt = s;

        //  }

        //  return lonelyInt;





    }
}
