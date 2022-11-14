package com.careerdevs.HackerRankInterview;

public class Day3TimeConversion {
    public static String timeConversion(String s) {
        // Write your code here


        int  finalNum = 0;



        //psuedo code
        // we have a regular 12 am to 12 pm clock format.
        // within this function we want to create a converted time from the regular 12 pm - 12 am to     military time
        // military time has a 24 hour clock, so any time after 12 pm in the afternoon will have to be converted
        // so we will be taking in a input as a string  that is currently in regular 12 hour clock format (hh:mm:ssAm or hh:mm:ssPm)
// once we take in the input we want to find key things  that indicate that we will be converting this from a regular clock format to military time
// one key indicator would be the PM time stamp , being able to indentify that will be one of the biggest parts of the conversion process
// most important part of the conversion process is switching the value for the firs two values in the string


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

    public static String timeConversion(String s) {
        // Write your code here

        String newStr = "";

        int number = 0;


        if( s.substring(0, 2).equals("12") && s.substring(s.length()-2, s.length()).equals("AM")){
            newStr = "00" + s.substring(2, s.length()-2);

        }else{
            number = Integer.parseInt(s.substring(0, 2)) + 12;
            newStr =
                    String.valueOf( number )+ s.substring(2, s.length()-2);
        }




        return newStr;

    }
}
