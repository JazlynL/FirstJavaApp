

public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        // boolean isItJump = true;



        int kangrooTwo = x2;


        for(int i = x1 ; i <=  kangrooTwo; i += v1){


        if( kangrooTwo  > i ){

        kangrooTwo  += v2 ;



        }


        if(kangrooTwo == i){
        return "YES";
        }



        }




        return "NO";

        }





}





        return "Yes";

        }