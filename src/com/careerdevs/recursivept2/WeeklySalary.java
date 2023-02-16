package com.careerdevs.recursivept2;

public class WeeklySalary {
    public static int WeeklySalary(int[] hours) {
    int resultTotal = 0,
            result = 0;
            for (int i = 0; i < hours.length; i++) {
        if (hours[i] > 8) {
            result = 80 + ((hours[i] - 8) * 15);
        } else {
            result = 10 * hours[i];
        }
        if (i >= 5) {
            result *= 2;
        }
        resultTotal += result;
    }

            return resultTotal;
}


    public static int WeeklySalaryTwo(int[] hours) {
        // earns 10 dollars for the frst 8 hours
        //every overtime hour = 15
        // earns 20 / ot = 30

        // storing for overall wage.
        int ultWage = 0;

        // storing for new wage
        int newWage = 0;

        // storing the wage
        int wage = 10;

        // for loop
        for(int i = 0 ; i < hours.length; i++){

            // if the hours are less than 8 do store the hour[i] * wage to a new variable.
            if(hours[i] <=  8){
                newWage = hours[i] * wage;


            }else{

                newWage = 80 + ((hours[i] - 8) * 15);
                //	newWage += newWage + (hours[i] * ot) ;
            }

            // if  I is over 5 which means = 5 days, multiply it by two.
            if(i >= 5){
                newWage *= 2;
            }

            ultWage += newWage;
        }
        return ultWage;
    }


    public static int WeeklySalaryThree(int[] hours) {
        // earns 10 dollars for the frst 8 hours
        //every overtime hour = 15
        // earns 20 / ot = 30

        // storing for overall wage.
        int totalSal= 0;

        // for loop
        for(int i = 0 ; i < hours.length; i++){


            // creating a boolean value
           boolean isWeekend = i > 4 ;

           // storing  the hours
           int numOfHours = hours[i];

           // calling method
           totalSal += getPayDay(numOfHours, isWeekend);
    }
        return 0;


}


public static int getPayDay(int hours , boolean isWeekend){
        int payDay = 0;
        // we will - 8 to get the extra hours
        int extraHours = hours - 8;

        if(extraHours >0){

            hours -= extraHours; // always equal 8
            // this will  multiply the extra hours by 15;
            payDay += extraHours * 15;
        }
        payDay += hours * 10;
        return payDay;

}

}
