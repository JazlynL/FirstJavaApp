package com.careerdevs.ThirtyDaysOfCode;

public class Day20Sorting {
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aTemp[i]);
                a.add(aItem);
            }


            // printout -- Array is sorted in numSwaps swaps.


            // printout the ---First Element: firstElement
            // print out the last element


            // Write your code here
            int numSwaps = 0;


            //  Hint: To complete this challenge, you will need to add a variable that keeps a running tally of all swaps that occur during execution.

            for (int i = 0 ; i < n ; i++){


                for (int j = 0 ; j < n -1 ; j++)
                    if (a.get(j) > a.get(j+1)){
                        Collections.swap(a,j,j+1);
                        numSwaps++;
                    }


                if(numSwaps == 0){
                    break;
                }
            }

            System.out.println("Array is sorted in "+ numSwaps +" swaps.");
            System.out.println("First Element: "+ a.get(0));
            System.out.println("Last Element: " + a.get(a.size()-1));
}
