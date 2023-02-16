package com.careerdevs.ThirtyDaysOfCode;

import java.util.Scanner;

public class Day25TimeComplexity {

    /* Notes!!!
  Ask developers we ask what is the runtime complexity

   run  time refers to the general efficiency of an algorithm.

   Big o notation in a sense refers to the worst case Runtime
     We are observing how an  algorithm is effected by the amount of data
     is inputted

     We write this by the input  size of N

  -- how fast is a given function Based on a given input of
  Size N...
  --How Fast the code runs in proportion to its input..
  --
  4 categories of Complexities.
  first running time is
  O (1) -> constant.. A program that doesnt vary of the size of inputs.

  Doesn't depend on the input.

  O(log(n)) -> logrimithic

  O(N) -> linear you go through each element once.

  **the size od the problem is the size of the solution

  input--time
  -----------
   10 // 10 secs
   100 // 100 secs
   1000//1000 secs


  O(n ^2 ) Quadratic (nested for loops)



    * */
    public class Solution {
        /*
        This is the standard algorithim wether a  number is prime or not.
           This is how we will get through the algorithim*/
        public static Boolean isPrime(int n){

            boolean isItP = true;


            // This conditional is stating that if n is less than or equal to 1, we are
            // going to set the boolean value to false, and return the newly set boolean value
            // prime numbers by defintion are only divisible by 2 numbers
            // it can be a prime number because it cant be 1
            // it is checking for the one edge case scenario, just incase a user
            //inputs 1
            //    System.out.println(n);

            if(n <= 1){
                isItP= false;

                return isItP;

                // otherwise, if our n value is greater than 1 , we will begin our iteration, of the data in var n at 2 , and continue to iterate through the data(numbers)we  are getting from var n.
                // we also want two because if the number is prime, it will be divisible
                // within whatever number is in variable n.
                // i < n/2 --- were checking to see if i is less than n / 2 , we
                //arent going to iterate completely through n just half of the value
                // this allows whatever number we are working with that is in var n, can be divided equally.
            }else{

                for(int i = 2 ; i <= n/2; i++){

                    // modolous on returns the remainder of the problem.
                    // so if this returns 0 , it cannot be prime, it went in evenly within the value.

                    if(( n % i) == 0 ){
                        isItP = false;
                        break;
                    }

                }

            }


            return isItP;

        }





        public static void main(String[] args)
        {
            // intialize the Scanner class
            Scanner scanner= new Scanner(System.in);


            // Grab the input and intitlaize  it to the scanner
            int t = scanner.nextInt();


            // then we are going to iterate through the input we were given
            for (int i = 0 ; i < t ; i++){

                // the we will store it to var n
                int n = scanner.nextInt();
                // System.out.println(n);
                boolean isitReallyP = isPrime(n);
                // so if a number is greater than or equal to two, and we  will use the
                // new boolen method to also decipher whether or not the number is prime
                if(isitReallyP){
                    System.out.println("Prime");
                }else{
                    System.out.println("Not prime");
                }








                // for( int i = 0 ; )

//     //
// A prime is a natural number greater than  that has no positive divisors other than  and itself. Given a number, , determine and print whether it is  or .

// Note: If possible, try to come up with a  primality algorithm, or see what sort of optimizations you come up with for an  algorithm. Be sure to check out the Editorial after submitting your code.

            }
            scanner.close();
        }

    }
}
