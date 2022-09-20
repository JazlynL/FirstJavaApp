package com.careerdevs.HackerRankInterview;

public class Day3TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here


        int  finalNum = 0;



        //12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
        // 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
        //Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
        //Complete the timeConversion function in the editor below. It should return a new string representing the ut time in 24 hour format.
//timeConversion has the following parameter(s):


        if(!s.substring(0, 2).contains("12") && s.contains("PM") ){
            finalNum = Integer.parseInt(s.substring(0, 2)) + 12;
            s = String.valueOf(finalNum)+ s.substring(2,s.length());
        }

        //  System.out.println(s);
        if(s.substring(0, 2).contains("12") && s.contains("AM")){
            String newStr = "00";
            s = newStr + s.substring(2, s.length());


        }





        return s.substring(0, s.length()-2);

    }
}
