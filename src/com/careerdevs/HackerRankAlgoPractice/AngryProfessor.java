
public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int studentCount = 0;
        for(Integer i : a){
        if(i < 0 || i == 0){
        studentCount++;
        }
        }

        if(studentCount >= k){
        return "NO";
        }else{
        return "YES";
        }




        }