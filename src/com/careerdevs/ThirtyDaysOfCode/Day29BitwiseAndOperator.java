public static int bitwiseAnd(int N, int K) {
        // Write your code here

    /*PsuedoCode
    We have two Integers N and K .
    we have a set of N integers in an array and the value is going to be 6
    We also have a value K out of the array.
    find integers A,B where A is less than B.
    the value that will come out of A&B is the maximum possible
    and whatever maximum value is returned  is going  to be less than <K...
    */
        /*  A really important operator I used was the bitwise& operator
          With the bitewise& it returns a one for each corresponding bit value.  */
        int maxVal = 0;




        for(int i = 0; i <= N;i++){
        for(int j = 0; j < i; j++){
        if((i&j) > maxVal && (i&j) < K){
        maxVal = i&j;
        }

        }


        }





        return maxVal;


        }