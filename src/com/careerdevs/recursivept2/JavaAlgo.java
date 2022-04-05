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
}
