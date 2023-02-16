public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here


        int maxVal = height.get(0);
        int difference = 0;

        for(int i = 0 ; i < height.size();i++ ){
        if(maxVal < height.get(i)){
        maxVal = height.get(i);
        }
        }


        if(maxVal > k){
        difference = maxVal -k;

        }


        return difference;

        }

        }
