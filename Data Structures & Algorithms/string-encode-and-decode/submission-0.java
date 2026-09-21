class Solution {
    public String encode(List<String> strs) {
        String outputEncoded = "";
        //do not need to treat empty str
        for (String word:strs){
            outputEncoded = outputEncoded + word.length()+ "#" + word;
        }

        return outputEncoded;
    }
    public List<String> decode(String str) {
        List<String> outputDecoded = new ArrayList<>();
        String sizeWord = "";
        int i =0;
        while(i != str.length()){

            if(str.charAt(i) != '#') {
                sizeWord = sizeWord + str.charAt(i);
                i++;
            }
            else {
                int start = i + 1;
                int end = start + Integer.parseInt(sizeWord);//if not inclusive
                String word = str.substring(start, end);
                outputDecoded.add(word);
                i = end;
                sizeWord = "";
            }
        }
        return outputDecoded;
    }

    
}
