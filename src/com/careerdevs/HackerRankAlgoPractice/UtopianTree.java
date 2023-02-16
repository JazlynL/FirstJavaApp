
public static int utopianTree(int n) {
        // Write your code here
        int count = 0 ;

        for(int i = 0 ; i <= n ; i++){
        if(i% 2== 0 ){
        count++;
        }else {
        count *= 2;
        }
        }

        return count;

        }