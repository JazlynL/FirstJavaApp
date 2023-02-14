import java.util.List;
import java.util.Scanner;

public class ArrayList {

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);

            List<List<String>> list = new ArrayList<>();
            List<List<String>> querLists = new ArrayList<>();
            //importing list class
            List<String> listy1 = new ArrayList<>();
            List<String> listy2 = new ArrayList<>();



            int N = scan.nextInt();

            int M = scan.nextInt();
            //scanner input
            for(int i = 0 ; i < N ; i ++){
                listy1.add(scan.nextLine());

            }

            for(int i = 0 ;i < M ;i++){
                listy2.add(scan.nextLine());
            }

            list.add(listy1);
            querLists.add(listy2);


            List<String> queries =  new ArrayList<>();

            for(int i = 0 ; i <querLists.size();i++){
                queries = querLists.get(i);

                for(int j = 0 ; j < queries.size();j++){
                    //  System.out.println( queries.get(j).replace(" ", ","));
                }
            }
            System.out.println(queries);

            for(int i = 0 ; i < list.size();i++){
                List<String> temp = list.get(i);


                for(int j = 0 ; j < temp.size();j++){

                    System.out.println( temp.get(j).replace(" ", ","));


                }
            }








        }
    }

}
