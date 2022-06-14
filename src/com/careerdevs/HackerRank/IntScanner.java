package com.careerdevs.HackerRank;

import java.util.Scanner;

public class IntScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // Complete this line
        // Complete this line

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // Complete this line
        // Complete this line
    }

    // second part of the challenge
    public static void scan2( ) {
        Scanner scan = new Scanner(System.in);


        // Write your code here.
        int i = scan.nextInt();
        double d = scan.nextDouble();
        // remember to yse next line so we are able to continue
        // the scanner to read the whitespace.
        scan.nextLine();
        String s  = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
