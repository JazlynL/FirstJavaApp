class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
     /* we have a choclate bar on this choclate bar they are values stored in it.
        they want to divide the segments of this choclate bar  to correspond
         to the values that are stored in the birthday and month.*/


        int countBirth = 0;


      // we do - m , so it wont go over bounds in the iteration.
        for(int i = 0 ; i <= s.size()-m;i++){

            int birthDaystorage = 0;

            //we use the i +m due to the comparison to the birth month of the indiviual.
            for(int j = i ; j <i + m ; j++ )
                birthDaystorage += s.get(j);


            if(birthDaystorage == d){
                countBirth ++;
            }


        }




        return countBirth;



    }
}