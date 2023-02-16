package com.careerdevs.HackerRank;

import java.util.Scanner;

public class DataTypeSort {
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code

                // casting the datatype to the code , and outputting the string name of the
                // datatype
                if(x == (byte)x)System.out.println("* byte");
                if(x == (short)x) System.out.println("* short");
                if (x== (int)x) System.out.println("* int");
                if(x == (long)x) System.out.println("* long ");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
