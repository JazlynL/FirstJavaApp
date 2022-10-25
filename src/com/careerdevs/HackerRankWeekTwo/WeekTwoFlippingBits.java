public static long flippingBits(long n) {
        // Write your code here

        // we used this to store the n value to a string binary number
        String newStr = Long.toBinaryString(n);

   // we intialize a empty string outside of the for loop
        String binaryStorage = "";
   // we used a for loop to loop through the string value in binary numbers
        for(int i = 0 ; i < newStr.length();i++){

            //we set conditionals  to be able to actually flip the  bit values so if it is 0-1 or 1-0.
        if(newStr.charAt(i) == '1'){
        binaryStorage += '0';
        }else{
        binaryStorage += '1';
        }
        }

         // then we
        for(int i = binaryStorage.length(); i < 32 ;i++){
        if (i < 32){
        binaryStorage = "1"+ binaryStorage;
        }
        }

        long finalBinary = Long.parseUnsignedLong(binaryStorage, 2);





        System.out.println(finalBinary);
        return finalBinary;

        }