public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        // scan.hasNext allows the program to determine whether or not there is more lines to be read by the scanner.

        while(scan.hasNextLine()){

        String camelString = scan.nextLine();

// we want to split it by every semicolon,

        //  each of the new strings that are split
        //this will create a new formulated array.
        // splitting the variable ex -- "S:V"
        String [] splitString = camelString.split(";",0);

        // we will begin setting our conditional to find the cases
        // that are met within the string
        // side note: when we are comparing strings we want
        // to use the .equals method this is a method string has to compare it,  to compare instead of the == operator
        if(splitString[0].equals("S")){

        if(splitString[1].equals("V")){

        // creating  another split var to split the varible
        // we are using the regex (?=[A-Z]) to split the strings, in regex this is how you are able tp find the capital within a sting value.
        //we want t0o split where it is capital
        String [] newStr = splitString[2].split("(?=[A-Z])");

        // we will then need to loop through the String, then Lower case each character that  is Uppercased
        // we want to make sure all the letters in the input output lowercase

        for(int i = 0 ; i < newStr.length;i++){
        if(i == newStr.length-1){
        System.out.print(" "+newStr[i].toLowerCase());
        }else{
        System.out.print(newStr[i]);
        }
        }
        System.out.print("\n");
        }
        else if(splitString[1].equals("M")){//splitting the method

        String [] newMethod = splitString[2].split("(?=[A-Z])");

        for(int i = 0 ; i < newMethod.length;i++){
        // if the i index is equal to length -1 ;use the substring method down below
        // this allows the computer to determine where the last two indexes should be removed
        // it will intialize the newly string data without the parathensis
        // once the condition is met it will return the else statement down below.
        if(i == newMethod.length-1){

        String finalMethod = newMethod[i].substring(0,newMethod[i].length()-2);

        System.out.print(finalMethod.toLowerCase());

        }else{
        System.out.print(newMethod[i].toLowerCase()+ " ");
        }


        }
        System.out.print("\n");
        }  else if (splitString[1].equals("C")){// splitting the class ex input = OrangeHighlighter ex out = orange highlighter

        String [] classSplit = splitString[2].split("(?=[A-Z])");

        for(int i = 0 ; i < classSplit.length;i++){
        if(i == classSplit.length-1 || i == 0 ){
        System.out.print(classSplit[i].toLowerCase() +" ");
        }else{
        System.out.print(" " + classSplit[i].toLowerCase());
        }

        // if i = the last position of if i = the first position.
        // we will lowerCase then print them together.
        //    if(i == classSplit.length-1|| i == 0){
        //        System.out.print(classSplit[i].toLowerCase());

        //     }else{
        //        System.out.print(classSplit[i].toLowerCase());
        //         }
        }
        //   System.out.print("\n");

        }
        }   else if(splitString[0].equals("C")){

        if(splitString[1].equals("V")){ // combine variable

        String [] combineVar = splitString[2].split(" ");
        for(int i = 0 ; i < combineVar.length; i++){
        if(i == 0 ){
        System.out.print(combineVar[i]);
        }else{
        // this line will do for example P^^ it will be uppercased
        String captilizeVar = combineVar[i].substring(0,1).toUpperCase()+ combineVar[i].substring(1);
        System.out.print(captilizeVar);
        }

        }
        System.out.print("\n");

        } else if(splitString[1].equals("M")){ // combine method ex In ="white sheet of paper" expected
        //out="whiteSheetOfPaper";
        String [] combineMethod = splitString[2].split(" ");

        for(int i = 0 ; i < combineMethod.length;i++){
        if(i == 0){
        System.out.print(combineMethod[i]);
        }else {
        String captilizedWords = combineMethod[i].substring(0,1).toUpperCase()+combineMethod[i].substring(1);
        System.out.print(captilizedWords + "()");
        }
        }
        System.out.print("\n");

        }else if(splitString[1].equals("C")){ // combine class. // ex In ="coffee machine" exp Out="CoffeeMachine"
        //
        String [] combineClass = splitString[2].split(" ");

        for(int i = 0 ; i < combineClass.length;i++){
        if(i == 0){
        String combineFinal = combineClass[i].substring(0,1).toUpperCase() + combineClass[i].substring(1);
        System.out.print(combineFinal);
        }else{
        String finalClass = combineClass[i].substring(0,1).toUpperCase()+ combineClass[i].substring(1);
        System.out.print(finalClass);
        }
        }
        System.out.print("\n");


        }

        }



        // System.out.println(camelString);

        }
        }