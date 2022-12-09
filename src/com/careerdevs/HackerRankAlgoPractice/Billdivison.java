public static void bonAppetit(List<Integer> bill, int k, int b) {

        // Write your code here

    /*

      We have a bill which is the overall  bill,

     index in which anas item  she doesnt eat.  k = bill[1]

     b is going to be the amount ana contributed to the bill.

     we have to calculate the value of the bill.

     split in half  based on the cost per person. 2

     if she was overcharged we will print what was owed

     if it is not overcharged it will print out a string Bon appetit

     otherwise if she was overcharged we wont print the value.

    for(int i : k){

    } */


        int sumOfBill = 0;

        for(int i = 0; i <bill.size();i++){
        if(i != k){
        sumOfBill+= bill.get(i);
        }



        }
        if((sumOfBill /2) == b){
        System.out.println("Bon Appetit");
        }else{

        System.out.println(b - (sumOfBill/2));}
        //System.out.println(k);


        }

        }