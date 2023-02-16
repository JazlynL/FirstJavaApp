public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here

        int countApples =0;
        int countOranges =0;



        // my theory to store values , from the calculated numbers
        List <Integer> appleVals = new ArrayList<>();
        List <Integer> orangeVals = new ArrayList<>();




        //calculate apples
        for(int i = 0 ; i < apples.size();i++){
        appleVals.add(apples.get(i) + a);

        }

        // calculate oranges
        for( int i = 0 ; i < oranges.size();i++){
        orangeVals.add(oranges.get(i) + b);
        }


        // to count how many fruits have fell.


        for(int j = 0 ;  j < appleVals.size();j++){

        if(appleVals.get(j) >= s && appleVals.get(j) <= t){
        countApples++;
        }
        }
        System.out.println(Math.abs(countApples));


        for(int j = 0 ;  j < orangeVals.size();j++){
        if(orangeVals.get(j) >= s && orangeVals.get(j) <= t){
        countOranges++;
        }
        }
        System.out.println(Math.abs(countOranges));











        }