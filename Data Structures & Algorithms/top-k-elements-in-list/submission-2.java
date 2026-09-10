class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>(); 
        for(int num:nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1); 
        }
        // lista de listas
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i=0; i < buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }
        int [] result = new int[k];
        int i = 0;
        for(int freq = buckets.length -1; freq >= 0 && i <  k; freq--){
            for(int num:buckets[freq]){
                result[i] = num;
                i++;
            }
        }
        return result;



    }
}
