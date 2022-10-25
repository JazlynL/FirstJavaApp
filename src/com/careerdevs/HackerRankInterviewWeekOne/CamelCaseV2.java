public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        // first we will have to intialize a scanner to get the input from the user
        Scanner input = new Scanner(System.in);

        // using a while loop to see if the scanner has a next var.
        while(input.hasNext()){

            // we intialized the string to the input of the STDIN.
            String camelCase = input.nextLine();

            // System.out.println(camelCase);

            // creating an array from the camelCase string.
            String [] arrayCamel = camelCase.split(";",0);

            //We will take two  inputs S or C. S = split and C= combine,We want to try to identify them.
            if(arrayCamel[0].equals("S")){
                // each character of S and V has a following character trailed to it its either M;C;V
                // so We will start out at M  that indicates method.
                // for the method part we want to lower case the whole method and return the work without the paranthesis.
                if(arrayCamel[1].equals("M")){ // splitting method sweatTea() = sweat tea.

                     String []  methodSplit = arrayCamel[2].split("(?=[ A-Z])");
                     for(int i = 0 ; i < methodSplit.length;i++){
                        if(i == methodSplit.length-1){

                            String finalMeth = methodSplit[i].substring(0, 3);
                            System.out.print( " " + finalMeth.toLowerCase()) ;
                        }else{
                            System.out.print(methodSplit[i]);
                        }
                    }
                    System.out.print("\n");
                }
                if(arrayCamel[1].equals("V")){// splitting var pictureFrame = picture frame.
                    String [] varSplit = arrayCamel[2].split("(?=[A-Z])");
                    for(int i = 0 ; i < varSplit.length;i++){
                        if(i == varSplit.length-1){
                            System.out.print(" " + varSplit[i].toLowerCase());
                        }else{
                            System.out.print(varSplit[i]);
                        }

                    }
                    System.out.print("\n");

                }
                if(arrayCamel[1].equals("C")){ // splitting class LargeSoftWareBook = large sorftware book

                    String [] classSplit = arrayCamel[2].split("(?=[A-Z])");
                    for(int i = 0 ; i < classSplit.length;i++){
                        if( i == 0|| i == classSplit.length-1){
                            System.out.print(classSplit[i].toLowerCase()+" ");
                        }else{
                            System.out.print(classSplit[i].toLowerCase() + " ");
                        }
                    }


                }}else if(arrayCamel[0].equals("C")){// combing the variable
                String [] combineVar = arrayCamel[2].split(" ");
                if(arrayCamel[1].equals("V")){
                    for(int i = 0 ; i < combineVar.length;i++){
                        if(i == 0){
                            System.out.print(combineVar[i]);
                        }else{
                            System.out.print(combineVar[i].substring(0, 1).toUpperCase()+  combineVar [i].substring(1));
                        }

                     }
                    System.out.print("\n");
                 }
                if(arrayCamel[1].equals("M")){//combing the method
                    String [] combineMethod = arrayCamel[2].split(" ");
                    for(int i = 0 ; i < combineMethod.length;i++){
                        if(i == 0){
                            System.out.print(combineMethod[i]);
                        }else{
                            System.out.print(combineMethod[i].substring(0, 1).toUpperCase()+ combineMethod[i].substring(1)+"()");
                        }
                    }
                    System.out.print("\n");
                 }
                if(arrayCamel[1].equals("C")){// combing the class
                    String [] combineClass = arrayCamel[2].split(" ");

                    for(int i = 0 ; i < combineClass.length;i++){
                        if(i == 0 ){
                            System.out.print(combineClass[i].substring(0, 1).toUpperCase() + combineClass[i].substring(1));
                        }else{

                            System.out.print(combineClass[i].substring(0, 1).toUpperCase() + combineClass[i].substring(1));
                         }
                     }
                    System.out.print("\n");


                }

            }



        }
    }
}