class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer,Integer> findNum = new HashMap<>();

        for(int i = 0 ; i < arr.size();i++){
            if(findNum.containsKey(arr.get(i))){
                findNum.put(arr.get(i),findNum.get(arr.get(i))+1);

            }else{
                findNum.put(arr.get(i), 1);
            }
        }

       // we are getiting the max value from the hasmap key value pairs,
        // this allows you to create a list of values.
        int max = Collections.max(findNum.values());

        // System.out.println(max);
 // this is how we are able to iterate through the list values.
        for(Integer e: findNum.keySet()){
 // if  the value equals the max val return the e value.
            if(findNum.get(e).equals(max)){
                // System.out.println(e);
                return e;
            }

        }

        return 95;
    }

}