package com.careerdevs.recursivept2;

public class RockPaperGame {
    public static String rps(String s1, String s2) {

	/*	rps("rock", "paper") ➞ "Player 2 wins"

rps("paper", "rock") ➞ "Player 1 wins"

rps("paper", "scissors") ➞ "Player 2 wins"

rps("scissors", "scissors") ➞ "TIE"

rps("scissors", "paper") ➞ "Player 1 wins"*/
        if(s1.equals(s2)){
            return "TIE";
        }else if(s1 == "paper"&& s2 == "rock"|| s1 == "scissors"&& s2 == "paper")
        { return "Player 1 wins";
        }else{
            return "Player 2 wins";
        }

    }
}
