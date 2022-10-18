public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> fNames = new ArrayList<>();


        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];


                // String newStr = "";

                // System.out.println( emailID.matches("(.*)@gmail.com"));


                /*
                 A method that helped me solve this problem
                 came from the Pattern class,
                 A regular expression,specified as String has to be compiled as
                 an instance of this class
                 This method tells whether or not this string matches the given regulaar expression.
                 It will ultimately return  a boolean value.
                 it will  only return if its true.
                A regex that helped me solve this was ( .*) this lets you specify the exact string pattern you want to find
                it works as a wild card.
                  */
                if(emailID.matches("(.*)@gmail.com")){
                    fNames.add(firstName);


                }


                // for(int i = 0 ; i < firstName.length();i++){
                //     for(int j = 0 ; j < emailID.length();j++){
                //         if(emailID.contains("@gmail")){
                //          wholeUser = firstName +  emailID;

                //          }
                //      }
                //  }


                //     System.out.println(wholeUser);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Collections.sort(fNames);
        for(String finalN : fNames){
            System.out.println(finalN);
        }

        bufferedReader.close();
    }
}