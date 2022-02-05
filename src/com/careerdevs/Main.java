package com.careerdevs;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello GITHUB");
        System.out.println(getFirstValue(new int[]{2, 4, 6, 8, 10}));
        System.out.println(addition(2 ));
        System.out.println(search(new int[]{2, 4, 6, 8, 10}, 8));
        System.out.println(convert(6));
        System.out.println(giveMeSomething("is cooking"));
        System.out.println(reverse(false));
        System.out.println(countWords("It's high noon"));
        System.out.println(getCount("Celebration"));
        System.out.println(sum(3, 2));
        System.out.println(isSameNum(2,2));
        System.out.println(calcAge(10));
        System.out.println(helloName("Gerald"));
        System.out.println(reverse("The only way to be truly satisfied is to do what you believe is great work."));
        System.out.println(triArea(3, 2));
        System.out.println(divisible(1));
        System.out.println(canCapture(new String[]{"A1", "B2"}));
        System.out.println(rev(215));
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 2, 8, 91}));
        System.out.println(match("hello", "hELLo"));

    }


        public static int getFirstValue(int[] arr) {
            return arr[0];
        }

       public static int addition(int num) {
        int nextNum= num+1;
        return nextNum;

    }
       public static int search(int arr[], int item) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
                return i;

        }
        return -1;
    }

    public static int convert(int minutes) {
        int seconds = minutes*60;
        return seconds;

    }

    public static String giveMeSomething(String a) {
        a = "something " + a ;
        return a ;

    }
       public static boolean reverse(boolean b) {

        if (b){
            return false;
        }
        return true;

    }
    public static int countWords(String s) {
        String [] split = s.split(" ");
        return  split.length;

    }


    public static int getCount(String str) {
        int vowelsCount = 0;

        String vowels = new String("aeiou");
        for(int i = 0; i < vowels.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if(vowels.charAt(i)==str.charAt(j)){
                    vowelsCount += 1;

                }

            }

        }
        return vowelsCount;

    }
    //Java algorithims #3
    public static int sum(int a, int b) {
        int sum = a+b;
        return sum;

    }
    public static boolean isSameNum(int x, int y) {
        return x == y  ? true:false;


    }
    public static int calcAge(int age) {
        return age*365;

    }
    public static String helloName(String name) {
        return "Hello " + name+ "!";

    }
    public static String reverse(final String str) {
        char[] reverse = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = reverse.length-1; i >= 0 ; i--){
            sb.append(reverse[i]);

        }
        return  sb.toString();


    }
 //BONUS questions
 public static int triArea(int base, int height) {
     int area = (base*height/2);
     return area;

 }
    public static boolean divisible(int num) {
        return num%100== 0 ?true:false;
    }
    public static boolean canCapture(String[] rooks) {
        return (rooks[0].charAt(0) == rooks[1].charAt(0)|| (
                rooks[0].charAt(1)  == rooks[1].charAt(1)) );

    }
//Bonus questions number 3
    public static String rev(int n) {

        int reversed = 0 ;
        while(n!=0){
            int num = n%10;
            reversed = reversed * 10 + num;
            n /=10;
        }
        return ""+Math.abs(reversed);
    }

    public static int differenceMaxMin(int[] arr) {
        int maxNum = arr[0];
        int minNum= arr[0];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] >= maxNum){
                maxNum = arr[i];
            }
            if(arr[i]<minNum){
                minNum = arr[i];
            }
        }
        return maxNum - minNum;

    }
    public static boolean match(String str1, String str2) {
        String word1 = str1.toLowerCase();
        String word2 = str2.toLowerCase();

        if (word1.equals(word2)){
            return true;
        }
        return false;


    }
}

