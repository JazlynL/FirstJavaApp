package com.careerdevs.recursivept2;

public class Main {
    public static void main(String [] args){
        recursionJava(10);
        System.out.println(recursionJava(10));

    }


    public static int recursionJava( int n){
        if(n <= 0){
            return n;
        }
        else{
            System.out.println(n);
            return recursionJava(n - 1);

        }

    }
}
