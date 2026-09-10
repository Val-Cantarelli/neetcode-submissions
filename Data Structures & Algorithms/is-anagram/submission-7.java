class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            // se nao existe, cria e coloca 1 como valor da chave. Se já existe: soma o valor da chave com 1
            Character sc = s.charAt(i);
            int sVal = map.merge(sc, 1, Integer::sum);
             if (sVal == 0) map.remove(sc);

            //agora tem que desfazer com t
            Character tc = t.charAt(i);
            int newVal = map.merge(tc, -1, Integer::sum);//tem que remover. Se nao nao posso checar mapa vazio
            if (newVal == 0) map.remove(tc);

        }
        return map.isEmpty();


    
    }
}
