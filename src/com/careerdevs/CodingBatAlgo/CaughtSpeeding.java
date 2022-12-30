public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday){
        if(speed >= 86){
        return 2;
        }else if(speed <= 85 && speed >= 66){
        return 1;
        }else{
        return 0;
        }
        }

        if(speed >= 81){
        return 2;
        }else if(speed <= 80 && speed >= 61){
        return 1;
        }
        return 0;
        }
