public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;

   // we want to intialize this first line , to the end of the a index to try to find the common multiples.
        int first = a.get(a.size()-1); // 4
        // last index to intialize the condition.
        int last = b.get(0);// 16

        // we will iterate from 4 - 16
        for(int i = first; i <= last; i++){
        boolean ifItIsmultiple = true;// to find multiple value
        // iterate through the a set
        for( int j = 0 ; j < a.size();j++){
            // will elimate the values in the a  arraylist.
        if(i % a.get(j) != 0){
        ifItIsmultiple = false;
        break;
        }
        }
        // if this is true
        if(ifItIsmultiple) /// 4,8,12,16
        {
            // then we go through a final  check.
        for(int j = 0 ; j < b.size();j++){
            // if it doesnt meet this condition
        if(b.get(j)% i != 0){
            // set to false
        ifItIsmultiple = false;
        break;
        }
        }


        }

        if(ifItIsmultiple){ // so once it passes the second test whatever numbers are left then we want to increnement the values;
        count++;
        }

        }
        return count;

        }