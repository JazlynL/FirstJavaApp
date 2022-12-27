public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int countBeau = 0 ;
        String reversed = "";
        String finalStr = "";

        //  System.out.println(k);

        for(int x = i ; x <= j ;x++){
        reversed = Integer.toString(x);
        finalStr = new StringBuilder(reversed).reverse().toString();


        if(Math.abs(x - Integer.valueOf(finalStr))% k == 0){
        countBeau++;

        }
        }

        return countBeau;


        }