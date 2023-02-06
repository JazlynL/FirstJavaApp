import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // increment by count of two

            int finalSum = a+ b;
            System.out.print(finalSum + " ");

            for(int j = 1; j < n ;j++){
                finalSum += Math.pow(2, j)*b;
                System.out.print(finalSum+ " ");


            }
            System.out.println();


            // System.out.println(b);
            // System.out.println(n);

        }
        // value set to 1 increment by 2.

        // add val 1 to the  a value multiply that by value b



        in.close();
    }
}