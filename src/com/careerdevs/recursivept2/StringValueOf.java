package com.careerdevs.recursivept2;

public class StringValueOf {
    public static String add(String a, String b) {


        if(a == null || b == null||a.equals("") || b.equals("")){
        return "Invalid Operation";
    }else{
			/*
			using Integer parse to parse the integer from a String value.
			parseInt(String s) − This returns an integer (decimal only).
			*/
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

			/*Using String value of Method to String class to use Value of.
			The java string valueOf() method converts different types of
			values into string. By the help of string valueOf() method,
			you can convert int to string, long to string, boolean to string,
			character to string, float to string,
			double to string, object to string and char array to string.
			*/
        return String.valueOf(x+y);


    }


}
}
