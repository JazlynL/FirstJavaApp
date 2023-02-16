public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int asCiiVal  = 0;

        int maxFound = 0;
        int foundVals = 0;
        List<Integer> listCompare = new ArrayList<>();



        for(int i  = 0 ; i < word.length();i++){
        //we have the ascii vals of the character String.
        asCiiVal = (int)word.charAt(i)-97;
        listCompare.add(asCiiVal);
        }
        //  System.out.println(listCompare);

        for(int i = 0 ; i <listCompare.size();i++){
        if(maxFound< h.get(listCompare.get(i))){
        maxFound =h.get(listCompare.get(i));
        }
        }
        foundVals = maxFound* word.length();
        return foundVals;

        }

        }