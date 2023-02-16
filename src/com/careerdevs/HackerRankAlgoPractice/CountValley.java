public static int countingValleys(int steps, String path) {
        // Write your code here
    /*A hiker tracks their steps
    They start from sea level = 0
    the can either go up ^ +1 or down^-1 this will be a completion of a valley.
     steps = the numerical value
     We want to make sure to keep track of the valleys.
     A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
      */

        int countV = 0;

        //  boolean isValley = true;

        int seaLevel = 0;

        for(int i = 0 ; i < steps;i++){

        if(path.charAt(i) == 'D' ){
        seaLevel--;

        }
        if(path.charAt(i) == 'U'){
        seaLevel++;
        if(seaLevel == 0){
        countV++;

        }

        }



        }



        return countV;

        }