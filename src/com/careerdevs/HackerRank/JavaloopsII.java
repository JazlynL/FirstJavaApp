package com.careerdevs.HackerRank;

import java.util.Scanner;

public class JavaloopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();


            // nested for loop
            for(int j = 0 ; j < n;j++){
                a+=b;
                System.out.print( a + " ");
                b*=2;

            }

            System.out.println();
        }
        in.close();
    }
}
