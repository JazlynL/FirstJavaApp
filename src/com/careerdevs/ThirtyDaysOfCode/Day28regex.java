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