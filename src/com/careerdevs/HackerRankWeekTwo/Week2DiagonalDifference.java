public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

    /*
    we want to return the absolute difference of the array - meaning no negative return
       we will intialize a difference var to store the value.
        We will iterate through the first value of [n] once this is iterated
          we  will the iterate through the second vallue of [m]
           This are the values that we will be grabbing to find the difference
            from first iteration [i][j],[i+1][j+1],[i-1][j-1]
            from second iteration [i-1][j],[i+1][j+1],[i][j-1]
            once these values are identified from the index, then will store the difference value to a int var
            then return using Math.ABS to get the absolute differnce.
    */
        int absoulteNum = 0;


        int storageI = 0;
        int storageJ = 0;



        for(int i = 0 ; i < arr.size();i++){
        for(int j = 0 ; j< arr.get(i).size();j++){
        if(i == j){
        storageI += arr.get(i).get(j);
        }
        if(i == arr.size()-j-1){
        storageJ += arr.get(i).get(j);
        }

        }
        }

        absoulteNum = Math.abs(storageI-storageJ);


        System.out.println(storageI);
        System.out.println(storageJ);

        return absoulteNum;

        }

        }