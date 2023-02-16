package com.careerdevs.ThirtyDaysOfCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMappingDay8 {
    //Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

    class Solution{
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            // intializing the map to eventually store data.
            Map<String, Integer> dataFound = new HashMap<>();


            // HashMapping..
            //



            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                // Write code here


                // we will use the.put method to insert the data
                dataFound.put(name, phone);
            }
            // using while loop to keep track of user entry, hasNext method.
            while(in.hasNext()){
                String s = in.next();
                // creating conditional.....
                // using containsKey which is part of hashmap class.
                if(dataFound.containsKey(s)){
                    // we are able to use the get method . get to access the keys that are imported
                    System.out.println(s+ "=" + dataFound.get(s));
                }else{
                    System.out.println("Not found");
                }
                // Write code here
            }
            in.close();
        }
    }
}
