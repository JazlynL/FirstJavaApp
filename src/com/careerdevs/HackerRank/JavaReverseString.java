public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String newReverse = "";

        for(int i = A.length()-1; i >= 0 ; i--){
        newReverse= newReverse + A.charAt(i);

        }
        if(newReverse.equals(A)){
        System.out.println("Yes");
        }else{
        System.out.println("No");
        }



        }