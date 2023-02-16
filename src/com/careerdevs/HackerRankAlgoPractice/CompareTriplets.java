public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        /* We have a list that holds  3 values from a score
           they're two players , they both have 3 score values
           eachone of their points will be compared to the other one.
           when one is greater than the other we will  give a point to the corresponding high score
           once we tallied all the points we will then return the value in a arraylist;
           the points will be stored as [total = a][ total = b]


           going to refactor not the most optimal solution.
        */

        int alicePointsTotal = 0;
        int bobPoints = 0;

        List<Integer> totalPoints = new ArrayList<>();

        List<Integer> alicePoints = new ArrayList<>();
        List<Integer> bobPointsS = new ArrayList<>();




        for(int i = 0 ; i < 3;i++){
        alicePoints.add(a.get(i));
        }
        for(int j = 0 ; j < 3;j++){
        bobPointsS.add(b.get(j));

        }
        if(alicePoints.get(0) > bobPointsS.get(0)){
        alicePointsTotal++;

        }if(alicePoints.get(1) > bobPointsS.get(1)){
        alicePointsTotal++;
        }if(alicePoints.get(2)> bobPointsS.get(2) ){
        alicePointsTotal++;
        }
        if(bobPointsS.get(0) > alicePoints.get(0)){
        bobPoints++;
        }
        if(bobPointsS.get(1)> alicePoints.get(1)){
        bobPoints++;
        }
        if(bobPointsS.get(2) > alicePoints.get(2)){
        bobPoints++;
        }





        totalPoints.add(alicePointsTotal);
        totalPoints.add(bobPoints);


        return totalPoints;


        }