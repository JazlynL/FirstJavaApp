package com.careerdevs.recursivept2.CodingBatAlgo;

public class CodingBat {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        // 0 = no ticket, 1 = small ticket . 2 = big ticket;
        //if speed if 60 < result = 0 ; if speed = 61- 80 = 1  if speed is 81 + = 3
        //if birthday 65 = 0 ; 66 - 65 = 1; 83 = 3
        if(isBirthday == false){
            if(speed <= 60)
                return 0;
            else if (speed >= 61 && speed <= 80)
                return 1;
            else if( speed >= 81)
                return 2;
        }
        if(speed <= 65){
            return 0;
        }else if ( speed >= 66 && speed <=85){
            return 1;
        }else {
            return 2;
        }

    }
}
