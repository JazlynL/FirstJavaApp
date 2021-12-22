package com.careerdevs;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello GITHUB");
        System.out.println(getFirstValue(new int[]{2, 4, 6, 8, 10}));
        System.out.println(addition(2 ));

    }


        public static int getFirstValue(int[] arr) {
            return arr[0];
        }

       public static int addition(int num) {
        int nextnumber = num+1;
        return nextnumber;

    }
    }
