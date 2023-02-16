import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        //store it in here after.
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String  [] sbArr = new String [s.length() - (k-1)];

        //studying lexographical measurements of  characters java
        for(int i = 0 ; i < s.length();i++){
            String parts = "";
            for(int j = i ; j < s.length();j++){
                parts += s.charAt(j);
                if(parts.length() == k){
                    sbArr[i]= parts;
                }
            }

        }

        for(int i = 0 ; i < sbArr.length-1;i++){
            if(sbArr[i].compareTo(sbArr[i+1]) > 0){
                String temp = sbArr[i];
                sbArr[i] = sbArr[i+1];
                sbArr[i+1] = temp;
                i=-1;
            }
        }

        return sbArr[0] + "\n" + sbArr[sbArr.length-1];
    }




