

public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here



        int count = 0;

        for(int i = 0 ; i < n;i++){

        int divisu = ar.get(i);
  //  itialize j to 1  because i is always going to be less the j 
        for(int j = 1; j < n; j++){
       
        if(i < j){
            
            // using () Pemdas
        if((divisu + ar.get(j)) % k == 0){
        count++;
        }
        }


        }

        }
        System.out.println(count);
        return count;
        }
    