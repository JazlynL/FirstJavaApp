package com.careerdevs.HackerRank;

import java.util.Scanner;

public class formatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line


            // we will use printf instead of print line.
            // since string length is no more that 15 we  will use -15
            // %s stands for string %d stands for number


            //"%-15s%03d%n", s1, x
            System.out.printf("%-15s%03d%n",s1, x);


        }

        System.out.println("================================");

    }
}
