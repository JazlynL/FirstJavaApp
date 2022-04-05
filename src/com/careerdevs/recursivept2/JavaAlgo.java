package com.careerdevs.recursivept2;

public class JavaAlgo {
    public static double discount(int price, int percentage) {
        // find discounted price
        // double discountPercentage = percentage%100;
        // you are able to make java compilier read an int as a float by adding f to the int.

        float disCount = percentage / 100f;
        float overAllPrice = price * disCount;
        float moneySaved = price -  overAllPrice;
        System.out.println(moneySaved);
        return moneySaved;



    }



    public static boolean testJackpot(StringValueOf[] result) {

        return isEveryElementAlike(result);

        // the way it was done in class
    }

    public static boolean isEveryElementAlike(StringValueOf[] array ){
        // we access the first element this way.
        StringValueOf element = array[0];

        //start with a for loop
        for(int i = 0 ; i < array.length;i++){
            if(!element.equals(array[i])){
                return false;
            }


        }
        return true;
    }
}
