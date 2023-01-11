import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        /// using tokenizer data structure.
        String newStr = s.replaceAll("[^a-zA-Z0-9\\s+]", " ").trim();

        // System.out.println(newStr);
        StringTokenizer st = new StringTokenizer(newStr," ");

        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextElement());

        }





        scan.close();
    }
}