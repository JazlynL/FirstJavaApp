class Result {

    /*
     * Complete the 'twoArrays' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     *  3. INTEGER_ARRAY B
     */

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here

        A.sort(Comparator.reverseOrder());
        B.sort(Comparator.naturalOrder());

        for(int i = 0 ; i < A.size();i++){
            if(A.get(i) + B.get(i)   < k){
                return "NO";
            }
        }
        return "YES";


    }

}