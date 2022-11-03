public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;

        int first = a.get(a.size()-1); // 4
        int last = b.get(0);// 16

        for(int i = first; i <= last; i++){
        boolean ifItIsmultiple = true;// to find multiple value
        for( int j = 0 ; j < a.size();j++){
        if(i % a.get(j) != 0){
        ifItIsmultiple = false;
        break;
        }
        }
        if(ifItIsmultiple) /// 4,8,12,16
        {
        for(int j = 0 ; j < b.size();j++){
        if(b.get(j)% i != 0){
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