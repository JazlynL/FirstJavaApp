
public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int count = 0 ;
        Collections.sort(ar);


        for(int i = 0 ; i < n-1;i++){
        if(ar.get(i) == ar.get(i+1)){
        count++;
        i++;

        }


        }

        return count;

        }
