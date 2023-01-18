
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        for(int i = 0 ; i < testCases;i++){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}
//List Algorithim.
import java.io.*;
        import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner newScan = new Scanner(System.in);

        int n = newScan.nextInt();

        List<Integer> newList = new ArrayList<>();
        for(int i = 0 ; i< n ; i++){
            newList.add(newScan.nextInt());
        }


        int vals = newScan.nextInt();
        // using this to read scanner correctly switching from int var to string
        newScan.nextLine();
        String values ="";

        String delete ="";


        for(int i = 0 ; i < vals;i++){
            String insert = newScan.nextLine();



            if(insert.equals("Insert")){
                values = newScan.nextLine();

                String[]  index = values.split(" ");

                int indexVal = Integer.valueOf(index[0]);
                int  replaceVal= Integer.valueOf(index[1]);

                newList.add(indexVal, replaceVal);

            }else{
                delete =newScan.nextLine();

                newList.remove(Integer.parseInt(delete));

            }
        }








        String finalList = Arrays.toString(newList.toArray()).replace("[", "").replace("]", "");
        System.out.println(finalList.replace(",", ""));






    }
