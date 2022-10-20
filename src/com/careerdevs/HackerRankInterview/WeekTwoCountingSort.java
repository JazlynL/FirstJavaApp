class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here

        // we populate this array with the Collections.nCopies  and we are using this tool based on the constraints
    List <Integer> results = new ArrayList<Integer>(Collections.nCopies(100, 0));



 // Big note - this
    for(Integer numOccurances : arr){


     results.set(numOccurances,results.get(numOccurances) + 1);


    }


//    System.out.println(results);

   return results;

 }

}