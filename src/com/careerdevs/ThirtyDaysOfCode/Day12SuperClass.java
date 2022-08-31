package com.careerdevs.ThirtyDaysOfCode;

public class Day12SuperClass {
    class Student {

        private int[] testScores;


        public Student (String firstName, String lastName, int id, int [] testScores){


            // super acts as  a constructor, to a subclass that is extended,
            // we are using super to inherit from a class to a subclass  of the main class
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



            // we created an empty int variable
            int  grade = 0 ;

            // then we iterated it through the length
            for(int i = 0; i < testScores.length;i++){
                // we use the concat operator  to  add the iterated data from the students
                grade += testScores[i];
            }

            // getting the average....
            int newGrade =  grade/testScores.length;


        // creating an empty character variable to eventually store the  Letter grades by student
            char finalGrade = 0;

          // setting the conditonals based on the value we are expecting with the letter grades.
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
            // then return the char value

            return finalGrade;
        }
    }
}
