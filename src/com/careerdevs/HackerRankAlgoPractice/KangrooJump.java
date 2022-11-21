
public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        // boolean isItJump = true;



        int kangrooTwo = x2 + v2;


        for(int i = x1 ; i < x1 + x2; i += v1){


        if( kangrooTwo  > i  ){
        kangrooTwo  =  v2 += 2 ;

        System.out.println(kangrooTwo);
        }



        }





        return "Yes";

        }