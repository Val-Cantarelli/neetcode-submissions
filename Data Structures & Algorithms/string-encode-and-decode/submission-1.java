class Solution {
    public String encode(List<String> strs) {
        String outputEncoded = "";
        //do not need to treat empty str
        for (String word:strs){
            outputEncoded = outputEncoded + word.length()+ "#" + word;
        }

        return outputEncoded;
    }
    public List<String> decode(String string){
        List<String> result = new ArrayList<>();
        int index = 0;

        while(index < string.length()) {
            StringBuilder lengthDigits = new StringBuilder();

            while(string.charAt(index) != '#'){
                lengthDigits.append(string.charAt(index));
                index++;
            }
            index++;
            int wordLength = Integer.parseInt(lengthDigits.toString());
            String word = string.substring(index,index+ wordLength);
            result.add(word);
            index = index+ wordLength;

        }
        return result;
    }
    
}
