class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>(); 
        //popula mapa key elem: value freq
        for(int num:nums){
        frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
    // ordena a lista usando as frequencias - colocando as maiores na frente
    list.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
    int[] result = new int[k];
    for(int i =0; i< k; i++){
        result[i] = list.get(i).getKey();
    }

    return result;
        
    }
}
