public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        Collections.sort(sticks);
        System.out.println(sticks);

    /*We are trying to find the largest Maximum combination numbers that will create a non degenerate triangle of this arrayList. we have three elements we want to compare within the list. the out of the three elements we want to return the largest 3 nums
      a+b > c
       b+c >  a
       c+a > b

    a+b+c = length;
       */
        List<Integer> finalN = new ArrayList<>();
        int a = 0;
        int b= 0;
        int c= 0;

        for(int i = 0 ; i < sticks.size()-2;i++){
            // we use these vars to condense the data
        int tempA = sticks.get(i+1);
        int tempB = sticks.get(i);
        int tempC = sticks.get(i+2);

        // then we are going to check if the
        if(tempB + tempA > tempC && tempB + tempC > tempA && tempA + tempC > tempB){
        b = tempB;

        a = tempA;
        c = tempC;

        }
        }


        if( a == 0 && b == 0 && c == 0){
        finalN.add(-1);
        }else{

        finalN.add(b);
        finalN.add(a);
        finalN.add(c);

        }
        return finalN;

        }