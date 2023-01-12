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
    // solving subarrary using a standard array .
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanny = new Scanner(System.in);
        int n = scanny.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i< arr.length;i++){
            arr[i] = scanny.nextInt();
        }
        int counter = 0;

        for(int i = 0 ; i< n;i++){
            int currentSum = 0;
            for(int j = i; j < n;j++){
                //  currentSum +=arr[j];
                currentSum = arr[j] + currentSum;
                if(currentSum < 0){
                    //  System.out.println(currentSum);
                    // System.out.println(arr[j]);


                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}