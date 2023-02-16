public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here


/* We have multiple values of heights of the candles,We want to identify the tallest candle from the sequence.  once we identify the max values for the tallest candle heights, we will then keep track of how many values are the tallest (indicating duplicates) I believe once we

    int count = 0;

    // finding max value
    int max = candles.get(0);

    for(Integer i: candles){
        if( max > candles){
            max = candles.get(0);
        }
    }

    // loop through loop again to find the duplicate values.
    for(Integer i: candles){
        if(max == candles){
            count++;

        }
    }

    return count;


    */



        int count = 0;
        int maxValue = candles.get(0);


        for(Integer i: candles){

        if(maxValue < i){
        maxValue = i;
        }
        }
        System.out.println(maxValue);

        for(Integer j : candles){
        if(maxValue == j){
        count++;

        }
        }
        return count;

        }

        }