import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        // return sum of length of both A and B.

        int sumOFAll =0;
        sumOFAll = A.length() + B.length();
        System.out.println(sumOFAll);


        //determine if string A is bigger than b
        String finalResult = "";

        for (int i = 0; i <A.length() && i < B.length(); i++) {

            if(A.charAt(i) < B.charAt(i)){

                finalResult ="Yes";
//

            }else{

                finalResult = "No";
            }

        }

        if(A.length() < B.length()&& A.charAt(0)==B.charAt(0)){

          // you can use a compare too
            finalResult="No";


        }
        System.out.println(finalResult);

        // return the capital letter of eachother
        String aStr= A.substring(0,1).toUpperCase() + A.substring(1, A.length());


        String bString = B.substring(0,1).toUpperCase() + B.substring(1, B.length());

        System.out.println(aStr.concat(" ")+ bString);


    }
}