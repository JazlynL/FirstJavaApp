public static String pangrams(String s) {

        Set<Character> find = new HashSet<>();

        String newStr = s.replaceAll(" ", "");



        String finalStr = "";
        for(int i = 0 ;i < newStr.length();i++){
        finalStr += newStr.toLowerCase();

        find.add(finalStr.charAt(i));


        }



        if(find.size() == 26){
        return "pangram";

        }else{
        return "not pangram";
        }






        }