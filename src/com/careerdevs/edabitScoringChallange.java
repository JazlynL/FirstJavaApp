package com.careerdevs;

public class edabitScoringChallange {
    public static int[] calculateScores(String str) {
        int player1 = 0;
        int player2 = 0;
        int player3 = 0;

        for(int i = 0 ; i < str.length();i++){
            if(str.charAt(i) == 'A'){
                player1++;
            }if(str.charAt(i) == 'B')
                player2++;

            if(str.charAt(i)== 'C'){
                player3++;
            }
        }
        // review
        return new int [] {player1,player2,player3};


    }
}
}
