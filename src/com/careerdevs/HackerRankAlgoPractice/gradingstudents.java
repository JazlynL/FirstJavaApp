public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        // any grade less than 40 is a failing grade
        // so if the diference  between the grade and the next 5 multiple is  <=3 round up to the next multiple
        // if the value of the grade is less than 38 it will be an automatic failing grade.
    /*

    List <Integer> listy = new ArrayList<>;


    for(i : grades){
        if(grades.get(i)>= 38){

            int difference = Math.round(grades.get(i)) - grades.get(i);

            if(difference < 3){
                return listy.add(Math.round(grades.get(I)));
            }else{
                return listy.add( grades.get(i));
            }
        }
    }
    */

        List<Integer> finalGrade = new ArrayList<>();


        for(Integer i : grades){
        if(i >= 38){
        double roundIt =5*Math.ceil(i/5) + 5;
        if(roundIt - i  < 3){
        finalGrade.add((int)roundIt);
        }else{
        finalGrade.add(i);
        }
        }else{
        finalGrade.add(i);
        }
        }

        return finalGrade;
        }