class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        
        // Se key nao est;a no mapa: put(key, add.word)
        // Se key está no mapa: add word na list
        // retorna as entry do mapa como resposta

        // Cria Map de <String<List<String>>>
        Map<String,List<String>> map = new HashMap<>();

        
        // para cada word do input: 
        for(String word: strs){
            // key: ordena a word. 
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            // melhoria:map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
            if(map.containsKey(key)) map.get(key).add(word);
            else{
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key,list);
            }

           
        }
        
        

        return new ArrayList<>(map.values());
    }
}
