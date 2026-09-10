class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>(); 

        for(int num:nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1); 
        }
        // PQ with lambda on constructor
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((entryA,entryB) -> entryA.getValue() - entryB.getValue());
        for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
            // aqui "entry" é cada par (número, frequência), um de cada vez
            minHeap.add(entry);
            if(minHeap.size() > k){minHeap.poll();}
        }

        int[] result = new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i] = minHeap.poll().getKey();
            i++;
        }        
        return result;


    }
}
