
public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String findIt = A.toLowerCase();

        String newStr = "";

        for(int i = findIt.length()-1;i >= 0 ; i--){
            newStr=  newStr + findIt.charAt(i);
        }
        //     char charFind;
        //    for(int i = 0  ;i < findIt.length();i++){
        //        charFind = findIt.charAt(i);
        //        newStr = charFind+ newStr;

        //    }
        if(findIt.equals(newStr)){

            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        //    if(findIt == newStr){
        //        System.out.println("Yes");
        //    }else{
        //     System.out.println("No");
        //    }
        // System.out.println(newStr);
    }
}