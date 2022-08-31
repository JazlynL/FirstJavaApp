package com.careerdevs.ThirtyDaysOfCode;

public class Day12SuperClass {
    class Student extends Person{

        private int[] testScores;


        public Student (String firstName, String lastName, int id, int [] testScores){
            // super acts as  a constructor,
            // we are using super to
            super(firstName, lastName, id);
            this.testScores = testScores;
        }


        /*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         */
        // Write your constructor here

        /*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         */
        // Write your method here

        public char calculate (){
            //  String grades = "";
            //  grades = "T,D,P,A,E,O";
            //  String newStr = grades.replaceAll("[^a-zA-Z0-9]", " ");

            // // for(int i = 0; i < newStr.length();i++){
            // //     if(newStr.charAt(i) == 'T'){

            // //     }
            //  iterate through  testScores array ;
            // intialize  a   var to the iterated data extreacted from the array.


            int  grade = 0 ;

            for(int i = 0; i < testScores.length;i++){
                grade += testScores[i];
            }

            // getting the average....
            int newGrade =  grade/testScores.length;



            char finalGrade = 0;

            if( newGrade > 0 && newGrade < 40){
                finalGrade = 'T';
            }else if (newGrade >= 40 && newGrade < 55){
                finalGrade ='D';
            }else if (newGrade >= 55 && newGrade < 70){
                finalGrade = 'P';
            }else if (newGrade >= 70 && newGrade < 80){
                finalGrade = 'A';
            }else if (newGrade >= 80 && newGrade < 90){
                finalGrade ='E';
            }else {
                finalGrade ='O';
            }

            return finalGrade;
        }
    }
}
