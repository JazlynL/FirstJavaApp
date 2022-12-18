public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int inputNum = scan.nextInt();

            // System.out.println(inputNum );


            List<Integer> findSub = new ArrayList<>();


            // conversion to array
            findSub.add(inputNum);

            int vcount= 0;


            for(int i = 0 ; i < inputNum;i++){

                for(int j = i ; j < inputNum-i;j++){
                    findSub.set(j , findSub.get(j)+ findSub.get(j+ i));

                    if(findSub.get(j)< 0  ){
                        vcount++;
                    }
                }

            }
            System.out.println(vcount);





        }
    }
}