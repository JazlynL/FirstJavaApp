public class Solution {



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int maxVal = Integer.MIN_VALUE;
// redoing code
        for(int i = 0 ; i < 4;i++){
            for(int j = 0 ; j < 4;j++){
                int sum = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)+
                        arr.get(i+1).get(j+1)+
                        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                if(sum > maxVal){
                    maxVal = sum;
                }
            }
        }

        System.out.println(maxVal);
    }
}
// refactord solution.
int maxVal = -63;

      for(int i = 0 ;i < 4 ; i++){
        for(int j = 0 ;  j < 4;j++){
        int hourGlass = 0;
        hourGlass = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
        arr.get(i+1).get(j+1) +
        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
        maxVal =  Math.max(maxVal, hourGlass);

        }
        }
        System.out.println(maxVal);