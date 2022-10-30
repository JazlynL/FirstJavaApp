class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
    /* We have a list of values ; In this array list they are different values stored within the indexes.
    We want to iterate through the List, then add each value. #note they are very big values,
     we want to return a long value
    Long val  = 0;
      For (Long i : arr){
          val += i
          }
          return val.
          */

        long finalVal = 0;

        for(Long i : ar){
            finalVal += i;
        }
        return finalVal;

    }

}