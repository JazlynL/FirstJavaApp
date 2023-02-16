public static int pageCount(int n, int p) {
        // Write your code here




        int pagesCountMin = p/2;

        // reverse for loop on n
        int difference = n-p;

        if(difference == 1){
        difference = n%2 == 0 ? 1 : 0;
        }else{
            difference = difference/2;
        }

        if(pagesCountMin < difference){
        return pagesCountMin; }else{
        return difference;
        }












        }