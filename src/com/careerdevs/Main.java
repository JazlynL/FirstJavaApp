package com.careerdevs;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello GITHUB");
        System.out.println(getFirstValue(new int[]{2, 4, 6, 8, 10}));
        System.out.println(addition(2 ));
        System.out.println(search(new int[]{2, 4, 6, 8, 10}, 8));

    }


        public static int getFirstValue(int[] arr) {
            return arr[0];
        }

       public static int addition(int num) {
        int nextNum= num+1;
        return nextNum;

    }
       public static int search(int arr[], int item) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
                return i;

        }
        return -1;
    }


     }

