public static int viralAdvertising(int n) {
        // Write your code here

        //starting point
        int shared = 5;

        double culmative = 0.0;

        int liked = 2;


        for(int i = 0; i < n;i++){
        int floor = (int)Math.floor(shared/2);
        shared = floor*3;
        liked = floor;
        culmative+=liked;

        }
        // System.out.println((int)culmative);

        return (int)culmative;
        }